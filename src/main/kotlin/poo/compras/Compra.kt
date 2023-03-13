package poo.compras

class Compra {
    var listaCompra = mutableMapOf<Producto,Int>()

    fun comprar(producto: Producto, cantidad:Int){
        if (producto in listaCompra.keys){
            listaCompra[producto] = listaCompra[producto]!! + cantidad
            println("El producto ya estaba en la cesta. Hemos actualizado su cantidad")
        }
        else{
        listaCompra[producto] = cantidad
        println("Producto añadido a la cesta")
        }
    }
    fun modificarCantidad(producto: Producto, cantidad: Int){
        if (producto in listaCompra.keys){
            listaCompra[producto] = listaCompra[producto]!! + cantidad
            println("Cantidad actualizada.")
        }
        else{
            println("El producto no está en la cesta. Para añadirlo -> 1, para salir -> 0")
            var opcion = readln().toInt()
            when(opcion){
                1 -> comprar(producto, cantidad)
                else -> println("Saliendo...")
            }
        }
    }
    fun quitarProducto(producto: Producto){
        listaCompra.remove(producto)
    }
    fun menu(producto: Producto, cantidad: Int):Boolean{
        println("Que quieres hacer con tu cesta. introduzca el numero\n" +
                "1)Añadir producto\n" +
                "2)Borrar Producto\n" +
                "3)Modificar Cantidad de un producto\n" +
                "4)Ver el total actual\n" +
                "5)Ver el ticket")
        var opcion = readln().toInt()
        when(opcion){
            1 -> comprar(producto, cantidad)
            2 -> quitarProducto(producto)
            3 -> modificarCantidad(producto, cantidad)
            4 -> println(calcularPrecio())
            5 -> ticket()
            6 -> return false
        }
        return true
    }
    fun calcularPrecio():Double{
        var total = 0.0
        for ((producto, cantidad) in listaCompra){
            total += producto.calcular(cantidad)
        }
        return total
    }
    fun ticket(){
        fun imprimirLinea(producto: Producto, cantidad: Int){
            val espacios = "                          "
            var nombreproducto = producto.nombre
            val espacio =   espacios.length - nombreproducto.length
            for (i in 0..espacio) {
                nombreproducto += " "
            }
            println("$cantidad   ${nombreproducto}${producto.precio}      ${producto.calcular(cantidad)}")

        }
        println("\n     COMPRA")
        println("---------------------------")
        println("C   Producto                   p/u    Precio")

        for((producto,cantidad) in listaCompra){
            imprimirLinea(producto, cantidad)
        }
        println("\n                          TOTAL.........${calcularPrecio()}\n")
    }
}