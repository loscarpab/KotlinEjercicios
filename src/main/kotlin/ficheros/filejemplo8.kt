package ficheros

import java.io.File
import kotlin.math.max


fun main(args: Array<String>) {
    val file = File("fichero2.txt")
    val bufferedReader = file.bufferedReader()
    val text: List<String> = bufferedReader.readLines()

    val file2 = File("fichero3.txt")
    val bufferedReader2 = file2.bufferedReader()
    val text2: List<String> = bufferedReader2.readLines()

    val maxlength = max(text.size, text2.size)

    for (i in  0 until maxlength){
        if (i < text.size){
            println(text[i])
        }
        if (i < text2.size){
            println(text2[i])
        }
    }
}


