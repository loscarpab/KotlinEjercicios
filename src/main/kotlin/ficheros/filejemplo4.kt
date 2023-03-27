package ficheros

import poo.alquilerVehiculos.Coche
import java.io.File

fun main(args: Array<String>) {
    val fileName = "dataVehiculos2.txt"
    var file = File(fileName)
    var coche = Coche()
    // create a new file
    file.writeText(coche.toString())
}
