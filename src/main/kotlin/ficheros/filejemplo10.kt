package ficheros

import java.io.File
import java.io.PrintWriter
import kotlin.math.max

fun main(args: Array<String>) {
    val archivoOrigen = File("fichero2.txt")
    val archivoDestino = File("ficheroout.txt")
    print("Clave de encriptación: ")
    val clave = readln().toInt()
    val lineas = archivoOrigen.readLines()
    var encriptado = ""
    for (linea in lineas){
        for(char in linea){
            encriptado += char + clave
        }
      encriptado += 10.toChar()
    }
    println(encriptado)
    /*

        val encriptado = lineas.map { linea ->
        val caracteres = linea.toCharArray()
        val encriptados = caracteres.map { caracter ->
            val ascii = caracter.toInt() + clave
            val encriptado = if (ascii > 126) {
                (ascii - 94).toChar()
            } else {
                ascii.toChar()
            }
            encriptado
        }
        encriptados.joinToString("")
    }.joinToString("\n")

    // Escribir el archivo encriptado en el archivo de destino
    archivoDestino.writeText(encriptado)

    println("Archivo encriptado guardado en $destino")

 */

}