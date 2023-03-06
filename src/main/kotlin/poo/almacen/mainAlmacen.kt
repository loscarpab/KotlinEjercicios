package poo.almacen

fun main(){
    val cocacola15 = BebidaAzucarada(1.0, 1.5, "cocacola", 0.20, false)
    println(cocacola15.toString())
    val agua05 = AguaMineral(0.5, 0.3, "agua", "cadiz")
    val agua1 = AguaMineral(1.0, 0.8, "agua", "cadiz")
    val agua15 = AguaMineral(1.5, 1.2, "agua", "cadiz")
    val agua2 = AguaMineral(2.0, 1.5, "agua", "cadiz")
    val almacen = Almacen()
    almacen.crearEstantePorDefecto()
    almacen.agregarProductoConEstanteria(1, cocacola15)
    almacen.mostarInformacion()
    almacen.crearEstantePorDefecto()//se crea un estante 2
    almacen.agregarProductoConEstanteria(2, agua05)//metemos agua05 en estante 2
    almacen.mostarInformacionEstanteria()
    almacen.agregarProductoConEstanteria(2, agua1)//metemos agua1 en estante 2
    almacen.agregarProductoEstanteriaMenosProductos(agua15)//metemos agua15 en estante 1
    almacen.agregarProductoEstanteriaMasMismaMarca(agua2)//metemos agua2 en estante2
    almacen.mostarInformacionEstanteria()
    println(almacen.precioTotal())
    println(almacen.precioMarca("agua"))
    println(almacen.precioEstanteria(1))
    almacen.eliminarEstanteria(2)
    almacen.mostarInformacion()
    almacen.mostarInformacionEstanteria()//solo tiene que salir solo la estanteria 1
    almacen.crearEstantePorDefecto()
    almacen.mostarInformacionEstanteria()
    almacen.eliminarProducto(2)
    almacen.mostarInformacionEstanteria()
    almacen.eliminarEstanteria(3)
    almacen.mostarInformacionEstanteria()
    /*println("*****************************************")
    almacen.crearEstanteConId(4)
    almacen.crearEstantePorDefecto()//2
    almacen.crearEstantePorDefecto()//3
    almacen.crearEstantePorDefecto()//5
    almacen.crearEstanteConId(5)//tiene que pedir otro id de estanteria
    almacen.mostarInformacionEstanteria()//tienen que salir 6 estanterias
    almacen.eliminarProducto(1)
    almacen.mostarInformacion()
    almacen.mostarInformacionEstanteria()
    almacen.eliminarProductoMarca("agua")
    almacen.mostarInformacionEstanteria()

     */
}