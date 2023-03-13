package examen

import java.util.TooManyListenersException

class SocioConActvidades(nombreSCA:String, edadSCA:Int):Socio(nombreSCA, edadSCA) {
    var actividades = mutableListOf<Int>()


    constructor(nombreSCA: String, edadSCA: Int, actividadesSCA: MutableList<Int>) : this(nombreSCA, edadSCA) {
        actividades = comprobarActividadesEnLista(actividadesSCA)
    }

    fun comprobarActividadesEnLista(lista:MutableList<Int>):MutableList<Int>{
        var listaComprobantedeCopias = mutableListOf<Int>()
        for (actividad in lista){
            if (comprobarActividad(actividad)){
                if (actividad in listaComprobantedeCopias)
                    continue
                else {
                    listaComprobantedeCopias.add(actividad)
                }
            }
            else{
                if (actividad in listaComprobantedeCopias || 0 in listaComprobantedeCopias)
                    continue
                else
                    listaComprobantedeCopias.add(0)
            }
        }
        return listaComprobantedeCopias
    }
    fun apuntarseActividad() {
        var actividadesApuntadas = mutableListOf<Int>()
        actividadesApuntadas.addAll(actividades)
        mostrarActividades()
        println("Seleccione por numero la actividad a apuntarse")
        var idActividadaApuntarse = readln().toInt()
        actividades.add(idActividadaApuntarse)
        this.actividades = comprobarActividadesEnLista(actividades)
        if(actividadesApuntadas.size < actividades.size)
            println("Apuntado con exito.")
        else
            println("Ya estabas apuntado a esta actividad")
    }

    override fun balanceMensual(): Double {
        var totalMes = 0.00
        if (edad < 18) {
            totalMes = 20.00 + 10 * actividades.size
            if (totalMes > 40)
                totalMes = 40.00
        } else {
            totalMes = 35.00 + 10 * actividades.size
            if (totalMes > 60) {
                totalMes = 60.00
            }
        }
        return totalMes
    }

    override fun toString(): String {
        var cadena = ""
        for (actividad in actividades){
            cadena += "${this.obtenerNombreActividad(actividad)} "
        }
        if (cadena == "")
            cadena = "nada"
        return super.toString()+" Está apuntado a $cadena"
    }
}