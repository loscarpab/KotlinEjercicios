package ficheros

import poo.almacen.AguaMineral
import poo.almacen.Bebida
import poo.almacen.BebidaAzucarada

fun main(args:Array<String>){
    var bebida: Bebida
    if (args[0] == "azucarada"){
        bebida = BebidaAzucarada(args[1].toDouble(),args[2].toDouble(), args[3], args[4].toDouble(), args[5].toBoolean())
        println(bebida.toString())
    }
    if (args[0] == "mineral"){
        bebida = AguaMineral(args[1].toDouble(),args[2].toDouble(), args[3], args[4])
        println(bebida.toString())
    }

}