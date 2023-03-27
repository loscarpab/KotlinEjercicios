package ficheros

import java.io.File
import java.util.*

fun main(args: Array<String>) {
    val documento = File("prueba/Documento.txt")
    println(documento.absolutePath)
    val milisegundos = documento.lastModified()
    val fecha = Date(milisegundos)
    println("Últimamodificación (ms)   : $milisegundos")
    println("Últimamodificación (fecha): $fecha")
    println("Tamañodel archivo: " + documento.length())

}