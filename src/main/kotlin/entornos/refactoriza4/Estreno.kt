package VideoClub

class Estreno(var tituloEstreno:String,val diasAlquiler: Int): Pelicula(tituloEstreno, diasAlquiler) {

    override fun extracto(cliente: Cliente): Double {
        var importeTotal = diasAlquiler * 3.0

        return importeTotal
    }
    override fun puntosAlquiler(): Int{
        var puntos = 0
        if(diasAlquiler > 1) puntos ++
        return puntos
    }
}