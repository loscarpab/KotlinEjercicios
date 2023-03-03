package poo.almacen

class Almacen {
    var estanterias = mutableMapOf<Int, MutableList<Bebida>>(1 to mutableListOf<Bebida>())
    var estantePrimero = 1
    fun crearEstantePorDefecto(){
        var ultimoEstanteCreado = estantePrimero
        while (ultimoEstanteCreado in estanterias.keys) {
            ultimoEstanteCreado++
        }
        estanterias[ultimoEstanteCreado] = mutableListOf<Bebida>()
    }
    fun crearEstanteConId(id:Int){
        var identificador = id
        while (identificador in estanterias.keys || id <= 0){
            println("Id no disponible")
            identificador = readln().toInt()
        }
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
        println("Producto añadido con éxito")
    }
    fun agregarProductoEstanteriaMenosProductos(bebida: Bebida){
        var masVacia = estantePrimero
        for (estanteria in estanterias.keys) {
            if (estanterias[estanteria]!!.size <= estanterias[masVacia]!!.size)
                masVacia = estanteria
            else continue
        }
        estanterias[masVacia]!!.add(bebida)
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
    }
    fun eliminarProducto(identificador:Int){
        for (estanteria in estanterias.keys){
            for (i in 0 until estanterias[estanteria]!!.size){
                if (estanterias[estanteria]!![i].id == identificador){
                    estanterias[estanteria]!!.remove(estanterias[estanteria]!![i])
                    break
                }
                else continue
            }
        }
    }
    fun eliminarEstanteria(estanteriaeliminar: Int){
        fun comprobarMenosBebidas(mapa:MutableMap<Int, Int>):Int{
            var menosProductos = mapa[estantePrimero]
            var idMenosProductos = 0
            for (clave in mapa.keys){
                if (mapa[clave]!! <= menosProductos!!) {
                    menosProductos = mapa[clave]!!
                    idMenosProductos = clave
                }
            }
            return idMenosProductos
        }

        fun listaTamanos(mapa:MutableMap<Int, MutableList<Bebida>>):MutableMap<Int, Int>{
            var mapaDeTamanos = mutableMapOf<Int, Int>()
            for(clave in mapa.keys){
                mapaDeTamanos[clave] = mapa[clave]!!.size
            }
            return mapaDeTamanos
        }
        var estanteriaaeliminar2 = estanteriaeliminar
        while (estanteriaaeliminar2 == estantePrimero){
            println("No se puede borrar el primer estante")
            estanteriaaeliminar2 = readln().toInt()
        }
        var bebidasSinAsignar = mutableListOf<Bebida>()
        //copio la lista a eliminar para poder reasignarla mas tarde
        bebidasSinAsignar.addAll(estanterias[estanteriaeliminar]!!)
        //borro la lista a eliminar
        estanterias.remove(estanteriaeliminar)
        var mapaDeTamanos = listaTamanos(estanterias)
        //recoloco las bebidas en los sitios donde menos bebidas haya
        for(bebida in bebidasSinAsignar){
            var estanteriaAnadir = comprobarMenosBebidas(mapaDeTamanos)
            estanterias[estanteriaAnadir]!!.add(bebida)
            mapaDeTamanos = listaTamanos(estanterias)
            }

    }
    fun mostarInformacion(){
        println("------------------------")
        println("ALMACEN")
        println("------------------------")
        for (estanteria in estanterias.keys){
            for (bebidas in estanterias[estanteria]!!){
                println(bebidas.toString())
            }
        }
        println()
        println()
    }
    fun mostarInformacionEstanteria(){
        println("------------------------")
        println("ALMACEN(por estantes)")
        println("------------------------")
        for (estanteria in estanterias.keys){
            println("ESTANTE $estanteria")
            for (bebidas in estanterias[estanteria]!!){
                println(bebidas.toString())
            }
            println("---------------------------")
        }
    }

}