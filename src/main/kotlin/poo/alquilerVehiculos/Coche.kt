package poo.alquilerVehiculos

class Coche(matriculaCoche: String, duracionCoche: Int, plazasCoche: Int):VehiculoTransporte() {
    init {
        this.matricula = matriculaCoche
        this.duracion = duracionCoche
        this.numPlazas = plazasCoche
    }
    constructor():this("AAAA000", 0, 2)

    override fun recibo() {
        println("------------------")
        println("COCHE")
        println("------------------")
        super.recibo()
    }

    override fun alquiler(): Double {
        return ((this.duracion*50)+((1.5*this.numPlazas)*this.duracion))
    }
}