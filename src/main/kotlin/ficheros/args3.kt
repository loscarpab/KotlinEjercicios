package ficheros

import poo.tiendaProductos.*
import java.lang.NumberFormatException

fun crearTV(array:Array<String>, index:Int):TV? {
        try {
            return TV(array[index + 1].toDouble(), array[index + 2].toInt(), array[index + 3], array[index + 4].toInt())
        } catch (ex: Exception) {
            println("No se ha podido crear TV. Error con datos introducidos")
        }
    return null
}
fun crearMP3(array:Array<String>, index:Int):MP3Player? {
    try {
        return MP3Player(array[index + 1].toDouble(),array[index + 2].toInt(), array[index + 3], array[index + 4])
    }catch (ex:Exception){
        println("No se ha podido crear MP3. Error con datos introducidos")
    }
    return null
}

fun crearCamera(array:Array<String>, index:Int):Camera? {
    try {
        return Camera(array[index + 1].toDouble(),array[index + 2].toInt(), array[index + 3])
    }catch (ex:Exception){
        println("No se ha podido crear MP3. Error con datos introducidos")
    }
    return null
}
fun crearBook(array:Array<String>, index:Int): Book? {
    try {
        return Book(array[index+1],array[index + 2].toInt(), array[index + 3].toInt(), array[index + 4].toDouble())
    }catch (ex:Exception){
        println("No se ha podido crear MP3. Error con datos introducidos")
    }
    return null
}

fun crearProduct(array:Array<String>, index:Int):Product?{
    if (array[index] == "TV") return crearTV(array, index)
    if (array[index] == "MP3") return crearMP3(array, index)
    if (array[index] == "Camera") return crearCamera(array, index)
    if (array[index] == "Book") return crearBook(array, index)
    else return null
}
fun meterProducto(lista:MutableList<Product>, array: Array<String>, index: Int){
    try {
        lista.add(crearProduct(array, index)!!)
        println("Producto añadido con exito")
    }catch (ex:Exception){
        println("Producto no añadido")
    }
}
fun comprobarNombreProducto(array: Array<String>, index: Int):Boolean{
    return array[index] == "TV" || array[index] == "MP3" || array[index] == "Camera" || array[index] == "Book"
}

fun main(args:Array<String>){
    val listaCompra = mutableListOf<Product>()
    try {
        args[0].toInt()
        for (i in args.indices){
            if (comprobarNombreProducto(args, i)){
                meterProducto(listaCompra, args, i)
            }
            else continue
        }
    }catch (ex:NumberFormatException){
        meterProducto(listaCompra, args, 0)
    }
}