package poo.almacen

class Almacen {
    var estanterias = mutableMapOf<Int, MutableList<Bebida>>(1 to mutableListOf<Bebida>())
    var estantePrimero = estanterias.keys.first()
    fun crearEstantePorDefecto(){
        var ultimoEstanteCreado = estantePrimero
        while (ultimoEstanteCreado in estanterias.keys){
            ultimoEstanteCreado++
        }
        estanterias[ultimoEstanteCreado] = mutableListOf<Bebida>()
        println("Estante $ultimoEstanteCreado creado.")
    }
    fun crearEstanteConId(id:Int){
        var identificador = id
        while (identificador in estanterias.keys || id <= 0){
            println("Id no disponible. Introduce uno valido")
            identificador = readln().toInt()
        }
        estanterias[identificador] = mutableListOf<Bebida>()
        println("Estante $identificador creado.")
    }
    fun precioTotal():Double{
        var precioTotal = 0.0
        for (estanteria in estanterias.keys){
            for (bebidas in estanterias[estanteria]!!){
                precioTotal += bebidas.calcular(1)
            }
        }
        return precioTotal
    }
    fun precioMarca(marca: String):Double{
        var precioTotal = 0.0
        for (estanteria in estanterias.keys){
            for (bebidas in estanterias[estanteria]!!){
                if (bebidas.marca == marca)
                    precioTotal += bebidas.calcular(1)
                else continue
            }
        }
        return precioTotal
    }
    fun precioEstanteria(estanteria:Int):Double{
        var precioTotal = 0.0
            for (bebidas in estanterias[estanteria]!!){
                precioTotal += bebidas.calcular(1)
            }
        return precioTotal
    }
    fun agregarProductoConEstanteria(estanteria: Int, bebida:Bebida){
        estanterias[estanteria]!!.add(bebida)
        println("Producto añadido con éxito, en la estanteria $estanteria")
    }
    fun agregarProductoEstanteriaMenosProductos(bebida: Bebida){
        var masVacia = estantePrimero
        for (estanteria in estanterias.keys) {
            if (estanterias[estanteria]!!.size <= estanterias[masVacia]!!.size)
                masVacia = estanteria
            else continue
        }
        estanterias[masVacia]?.add(bebida)
        println("Producto añadido con éxito, en la estanteria $masVacia")
    }
    fun agregarProductoEstanteriaMasMismaMarca(bebida: Bebida){
        var contadorMismaMarca = 0
        var contadorMayorMismaMarca = 0
        var estanteriaMasMismaMarca = 0
        for (estanteria in estanterias.keys) {
            for (bebidas in estanterias[estanteria]!!){
                if (bebida.marca == bebidas.marca)
                    contadorMismaMarca += 1
                else continue
            }
            if (contadorMismaMarca > contadorMayorMismaMarca) {
                contadorMayorMismaMarca = contadorMismaMarca
                estanteriaMasMismaMarca = estanteria
            }
        }
        estanterias[estanteriaMasMismaMarca]!!.add(bebida)
        println("Producto añadido con éxito, en la estanteria $estanteriaMasMismaMarca")
    }
    fun eliminarProducto(identificador:Int){
        var borrarProducto = false
        for (estanteria in estanterias.keys){
            for (bebidas in estanterias[estanteria]!!){
                if (bebidas.id == identificador){
                    estanterias[estanteria]!!.remove(bebidas)
                    borrarProducto = true
                    break
                }
                else continue
            }
            if (borrarProducto)
                println("Producto borrado con exito. Se encontaba en la estanteria $estanteria")
                break
        }
    }
    fun eliminarProductoMarca(marca:String){
        /*
        fun eliminar1ProductoMarca():Boolean{

            for (estanteria in estanterias.keys) {
                for (bebida in estanterias[estanteria]!!) {
                    if (marca == bebida.marca) {
                        estanterias[estanteria]!!.remove(bebida)
                        return true
                    }
                }
            }
            return false
        }
        while (eliminar1ProductoMarca()){
            eliminar1ProductoMarca()
        }
         */
        for (value in estanterias.values){
            value.removeIf{it.marca == marca}

        }
    }
    fun eliminarEstanteria(estanteriaeliminar: Int){
        var bebidasSinAsignar = mutableListOf<Bebida>()
        bebidasSinAsignar.addAll(estanterias[estanteriaeliminar]!!)
        estanterias.remove(estanteriaeliminar)
        println("Borrando estanteria")
        for(bebida in bebidasSinAsignar){
            agregarProductoEstanteriaMenosProductos(bebida)
            }
        println("Estanteria $estanteriaeliminar eliminada.")
    }
    fun mostarInformacion(){
        println("------------------------")
        println("ALMACEN")
        println("------------------------")
        for (estanteria in estanterias.keys.sorted()){
            for (bebidas in estanterias[estanteria]!!.sortedBy { bebida: Bebida -> bebida.id }){
                println(bebidas.toString())
            }
        }

    }
    fun mostarInformacionEstanteria(){
        println("------------------------")
        println("ESTANTERIAS")
        println("------------------------")
        for (estanteria in estanterias.keys.sorted()){
            println("-----------ESTANTE $estanteria-----------")
            for (bebidas in estanterias[estanteria]!!.sortedBy { bebida: Bebida -> bebida.id }){
                println(bebidas.toString())
            }
            if (estanterias[estanteria]!!.isEmpty()){
                println("Estante vacio")
            }
            println("-------------------------------")
        }
    }

}