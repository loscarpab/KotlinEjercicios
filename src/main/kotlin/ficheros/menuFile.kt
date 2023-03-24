package ficheros

import java.io.File

fun crearFile(){
    println("Introduce nombre del archivo/directorio" +
            "\n~~para crear un directorio no pongas ninguna extension~~")
    var nombreFile = readln().toString()
    var file = File(nombreFile)
    if(file.isDirectory) file.mkdir()
    else file.createNewFile()
}

fun borrarFile(){
    println("Introduce nombre del archivo/directorio" +
            "\n~~para crear un directorio no pongas ninguna extension~~")
    var nombreFile = readln().toString()
    var file = File(nombreFile)
    file.delete()
}

fun entrarCarpeta(file: File):File{
    println("Introduce una carpeta")
    var nombreDir = File("$file/${readln()}")
    if(file.isDirectory) return nombreDir
    else{
        if (!nombreDir.isDirectory) {
            println("No es una carpeta")
            nombreDir = entrarCarpeta(nombreDir)
        }
    }
    return nombreDir
}
fun listarsoloDir(file: File){
    val listado = file.listFiles()
    for (file in listado){
        if (file.isDirectory){
            println("[DIR]"+file.name)
        }
        else println("[ARC]" + file.name)
    }
}

fun main(){
    while (true){
        var file2 = File("src/main/kotlin")
        listarsoloDir(file2)
        println("¿Que quieres hacer?:" +
                "\n0) Salir"+
                "\n1) Crear archivo o directorio" +
                "\n2) Borrar archivo o directorio" +
                "\n3) Entrar en carpeta"
        )
        var opcionMenu = readln().toInt()
        when(opcionMenu){
            0 -> break
            1 -> crearFile()
            2 -> borrarFile()
            3 -> file2 = entrarCarpeta(file2)
        }
    }

}