package entornos.refactoriza4

class Alquiler(val pelicula: Pelicula, val diasAlquilada: Int)

/*
private val alquileres = mutableListOf<Alquiler>()

fun agregarAlquiler(alquiler: Alquiler) {
    alquileres.add(alquiler)
}

fun getNombre(): String {
    return nombre
}

fun extracto(): String {
    var importeTotal = 0.0
    var puntosAlquilerFrecuente = 0
    var resultado = "Alquileres de $nombre\n"

    for (alquiler in alquileres) {
        var importe = 0.0

        when (alquiler.pelicula.codigoPrecio) {
            Pelicula.REGULAR -> {
                importe += 2.0
                if (alquiler.diasAlquilada > 2) {
                    importe += (alquiler.diasAlquilada - 2) * 1.5
                }
            }
            Pelicula.ESTRENO -> {
                importe += alquiler.diasAlquilada * 3.0
            }
            Pelicula.INFANTIL -> {
                importe += 1.5
                if (alquiler.diasAlquilada > 3) {
                    importe += (alquiler.diasAlquilada - 3) * 1.5
                }
            }
        }

        puntosAlquilerFrecuente++
        if (alquiler.pelicula.codigoPrecio == Pelicula.ESTRENO && alquiler.diasAlquilada > 1) {
            puntosAlquilerFrecuente++
        }

        resultado += "\t${alquiler.pelicula.titulo}\t$importe\n"
        importeTotal += importe
    }

    resultado += "La cantidad adeudada es $importeTotal\n"
    resultado += "Has ganado $puntosAlquilerFrecuente puntos por alquiler frecuente"


    return resultado
}
*/
