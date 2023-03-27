package ficheros

import poo.almacen.BebidaAzucarada

fun main(args:Array<String>){
    val bebida = BebidaAzucarada(args[0].toDouble(),args[1].toDouble(), args[2], args[3].toDouble(), args[4].toBoolean())
    println(bebida.toString())

}