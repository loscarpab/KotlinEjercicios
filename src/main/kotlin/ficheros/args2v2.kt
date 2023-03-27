package ficheros

import poo.almacen.AguaMineral
import poo.almacen.Bebida
import poo.almacen.BebidaAzucarada
import java.lang.Exception
import java.lang.NumberFormatException


fun main(args:Array<String>) {
    var bebida: Bebida
    /*
    if (args.size == 5) {
        try {
            bebida = BebidaAzucarada(
                args[0].toDouble(),
                args[1].toDouble(),
                args[2],
                args[3].toDouble(),
                args[4].toBoolean()
            )
        } catch (ex: NumberFormatException) {
            println("Datos erroneos")
        }
    }
    if (args.size == 4) {
        try {
            bebida = AguaMineral(args[0].toDouble(), args[1].toDouble(), args[2], args[3])
        } catch (ex: NumberFormatException) {
            println("Datos erroneos")
        }
    }

     */


    // 1.0 1.2 marca 0.15 0

    try {
        bebida = BebidaAzucarada(
            args[0].toDouble(),
            args[1].toDouble(),
            args[2],
            args[3].toDouble(),
            args[4].toBoolean()
        )
        println(bebida.toString())
    }catch (ex:Exception){
        try {
            bebida = AguaMineral(args[0].toDouble(), args[1].toDouble(), args[2], args[3])
            println(bebida.toString())
        }catch (ex:NumberFormatException){
            println("Datos introducidos no son validos para las bebidas disponibles")
        }
    }
}

