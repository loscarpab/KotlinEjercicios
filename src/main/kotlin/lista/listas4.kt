package lista

import java.util.*

fun main() {
    val productos = HashMap<String, Double>()

    for (i in 1..12) {
        println("Ingresar el nombre del producto $i:")
        val NombreProducto = readLine()!!
        println("Ingresar el precio del producto $i:")
        val PrecioProducto = readLine()!!.toDouble()

        productos[NombreProducto] = PrecioProducto
    }

    while (true) {
        println("Menú:")
        println("1. Borrar producto")
        println("2. Insertar producto")
        println("3. Actualizar producto")
        println("4. Realizar compra")
        println("5. Salir")

        println("Ingresar opción:")
        val opcion = readLine()!!.toInt()

        when (opcion) {
            1 -> {
                println("Ingresar nombre del producto a borrar:")
                val productoABorrar = readLine()!!
                productos.remove(productoABorrar)
                println("Producto $productoABorrar borrado.")
            }
            2 -> {
                println("Ingresar nombre del producto a insertar:")
                val NombreProducto = readLine()!!
                println("Ingresar precio del producto a insertar:")
                val PrecioProducto = readLine()!!.toDouble()
                productos[NombreProducto] = PrecioProducto
                println("Producto $NombreProducto insertado con precio $PrecioProducto.")
            }
            3 -> {
                println("Ingresar nombre del producto a actualizar:")
                val NombreProducto = readLine()!!
                println("Ingresar nuevo precio del producto:")
                val NuevoPrecio = readLine()!!.toDouble()
                productos[NombreProducto] = NuevoPrecio
                println("Precio del producto $NombreProducto actualizado a $NuevoPrecio.")
            }
            4 -> {
                println("Ingresar el nombre del primer producto:")
                val producto1 = readLine()!!
                println("Ingresar el nombre del segundo producto:")
                val product2 = readLine()!!
                println("Ingresar el nombre del tercer producto:")
                val product3 = readLine()!!
                val totalPrice = productos[producto1]!! + productos[product2]!! + productos[product3]!!
                println("El precio total de la compra es de $totalPrice.")
            }
            5 -> return
        }
    }
}
