package VideoClub

class Regular(var tituloRegular:String, val diasAlquiler: Int): Pelicula(tituloRegular, diasAlquiler) {

    override fun extracto(cliente: Cliente): Double {
        var importeTotal = diasAlquiler * 2.0
        if(diasAlquiler > 2) importeTotal += (diasAlquiler - 2) * 1.5
        return importeTotal
    }

    override fun puntosAlquiler(): Int {
        val puntos = 0
        return puntos
    }
}