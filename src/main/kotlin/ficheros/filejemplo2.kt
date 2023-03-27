package ficheros

import kotlin.jvm.JvmStatic
import java.io.File

object PruebaExiste {
    @JvmStatic
    fun main(args: Array<String>) {
        val temp = File("C:/prueba")
        val fotos = File("C:/prueba/Fotos")
        val document = File("C:/prueba/Documento.txt")
        println(temp.absolutePath + " ¿existe? " + temp.exists())
        mostrarEstado(fotos)
        mostrarEstado(document)
    }


    fun mostrarEstado(f: File) {
        println(f.absolutePath + " ¿archivo? " + f.isFile)
        println(f.absolutePath + " ¿carpeta? " + f.isDirectory)
    }
}
