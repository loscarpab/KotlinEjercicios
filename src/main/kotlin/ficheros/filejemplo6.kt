package ficheros

import java.io.File


fun main(args: Array<String>) {
    val file = File("fichero.txt")
    file.forEachLine { println(it) }


}


