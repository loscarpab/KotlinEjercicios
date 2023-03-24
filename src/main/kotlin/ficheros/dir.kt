package ficheros

import java.io.File


fun listarDir(file: File, identado:String= ""){
    val listado = file.listFiles()
    for (file in listado){
        if (file.isDirectory){
            println(identado + "[DIR]"+file.name)
           // identadosub += "  "
           listarDir(file, identado+"       ")
          //  listarDir(file, identadosub)
        }
        else println(identado + file.name)
    }
}

fun main(){
    val file = File("src/main/kotlin")
    println(file.absolutePath)
    listarDir(file)

}