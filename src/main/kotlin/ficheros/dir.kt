package ficheros

import java.io.File


fun listarDir(file: File, identado:String= ""){
    val listado = file.listFiles()
    listado.sortBy { it.isDirectory }
    for (file in listado){
        if (file.isDirectory){
            println(identado + "[DIR]"+file.name)
           listarDir(file, identado+"       ")
        }
        else println(identado + file.name)
    }
}

fun main(){
    val file = File("src/main/kotlin")
    println(file.absolutePath)
    listarDir(file)
}