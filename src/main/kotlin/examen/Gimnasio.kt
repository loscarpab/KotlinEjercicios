package examen

class Gimnasio(nombreG:String, direccionG:String) {
    var nombre = nombreG
    var direccion = direccionG
    var listaPersonas = mutableListOf<Persona>()
    fun anadirPersonas(persona: Persona){
        listaPersonas.add(persona)
        println("Persona añadida con exito a la lista")
    }
    fun eliminarPersonas(persona: Persona){
        listaPersonas.remove(persona)
        println("Persona eliminada con exito a la lista")
    }
    fun balanceTotal():Double{
        var total = 0.00
        println("BALANCE TOTAL")
        for (persona in listaPersonas){
            println("·$persona -> ${persona.balanceMensual()}")
            total += persona.balanceMensual()
        }
        println("Total\n--------------\n$total")
        return total
    }

    override fun toString(): String {
        var cadena = "$nombre($direccion)\n"
        for (persona in listaPersonas)
            cadena += "-${persona.toString()}\n"
        return cadena
    }
}