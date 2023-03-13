package poo.compras

fun main() {
    fun imprimirArticulos(lista:MutableList<Producto>){
        for (indice in lista.indices){
            println("${indice+1}) ${lista[indice].toString()}")
        }
    }
    val p1 = Perecedero("articulo1", 1.2, 3)
    val p2 = Perecedero("articulo2", 1.0, 1)
    val p3 = NoPerecedero("articulo3", 3.0, "bebida")
    val p4 = NoPerecedero("articulo4", 2.0, "comida")
    val p5 = NoPerecedero("articulo5", 5.0, "Legumbre")
    val p6 = NoPerecedero("articulo6", 5.0, "objeto")
    val articulosDisponibles = mutableListOf<Producto>(p1,p2,p3,p4,p5,p6)
    val compra = Compra()
    do{
        println("Elige un producto de los disponibles")
        imprimirArticulos(articulosDisponibles)
        var indice = readln().toInt()-1
        var producto = articulosDisponibles[indice]
        println("Cuantos ${producto.nombre} quieres")
        var cantidad = readln().toInt()
    }
    while (compra.menu(producto, cantidad))

}