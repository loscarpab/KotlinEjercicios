package ficheros

import java.io.File
import java.io.PrintWriter
import kotlin.math.max

fun escribir2ArchivosEn1(fileIn1: File, fileIn2: File, fileOut: File){
    val bufferedReader = fileIn1.bufferedReader()
    val text: List<String> = bufferedReader.readLines()

    val writer = PrintWriter(fileOut)
    for (line in text) {
        writer.append(line+"\n")
    }

    val bufferedReader2 = fileIn2.bufferedReader()
    val text2: List<String> = bufferedReader2.readLines()
    for (line in text2) {
        writer.append(line)
    }
    writer.close()
}


fun main(args: Array<String>) {
    val file = File("fichero2.txt")
    val file2 = File("fichero3.txt")
    val file3 = File("fichero17.txt")

    escribir2ArchivosEn1(file,file2,file3)


}