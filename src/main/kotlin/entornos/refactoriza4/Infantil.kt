package VideoClub

class Infantil(val tituloInfantil:String, val diasAlquiler: Int): Pelicula(tituloInfantil, diasAlquiler) {


    override fun extracto(cliente: Cliente): Double {
        var importeTotal = diasAlquiler * 1.5

        if(diasAlquiler > 3) importeTotal += (diasAlquiler - 3) * 1.5

        return importeTotal
    }

    override fun puntosAlquiler(): Int {
        val puntos = 0
        return puntos
    }
}