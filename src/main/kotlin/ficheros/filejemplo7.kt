package ficheros

import java.io.File


fun contarOcurrencias(palabra: String, archivo: File): Int {
    var contador = 0

    archivo.forEachLine { linea ->
        val palabras = linea.split(" ") // dividir la línea en palabras
        for (p in palabras){
            if (p == palabra) { // comparar la palabra con la palabra dada
                contador++
            }
        }
    }

    return contador
}


fun main(args: Array<String>) {
    val file = File("fichero.txt")
    val palabra = "ejemplo"
    val ocurrencias = contarOcurrencias(palabra, file)
    println("La palabra '$palabra' aparece $ocurrencias veces en el archivo.")
}


