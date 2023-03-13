package examen

open class Socio(nombreS:String, edadS:Int):Persona(nombreS, edadS) {
    private var numSocio = contadorNumSocio
    companion object{
        private var actividadesPosibles = mutableMapOf<Int, String>(0 to "otra", 1 to "karate", 2 to "spinning")
        private var contadorNumSocio = 1
    }
    init {
        contadorNumSocio++
    }

    override fun balanceMensual(): Double {
        if (edad < 18) return 20.00
        else return 35.00
    }

    fun mostrarActividades(){
        println("Actividades posibles:")
        for ((num,actividad) in actividadesPosibles){
            println("$num) $actividad")
        }
    }
    fun mostrarActividadesString():String{
        var string = ""
        for (actividad in actividadesPosibles.keys){
            if (actividad == 0)
                continue
            string += "${this.obtenerNombreActividad(actividad)},"
        }
        string += obtenerNombreActividad(0)
        return string
    }
    fun comprobarActividad(id:Int):Boolean{
        return id in actividadesPosibles.keys
    }
    fun anadirActividadPosible(nombreAct:String){
        var idNuevo = actividadesPosibles.keys.first()
        while (idNuevo in actividadesPosibles.keys){
            idNuevo++
        }
        actividadesPosibles[idNuevo] = nombreAct
    }
    fun obtenerNombreActividad(id:Int):String{
        return actividadesPosibles[id].toString()
    }

    override fun toString(): String {
        return "${super.toString()}, socio nº$numSocio"
    }
}