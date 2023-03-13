package VideoClub

abstract class Pelicula(var titulo:String, diasAlquiler: Int) {

    abstract fun extracto(cliente: Cliente): Double

    abstract fun puntosAlquiler(): Int
}