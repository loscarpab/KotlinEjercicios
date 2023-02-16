package poo.alquilerVehiculos

class Bus(matriculaBus: String, duracionBus: Int, plazasBus: Int):VehiculoTransporte()  {
    init {
        this.matricula = matriculaBus
        this.duracion = duracionBus
        this.numPlazas = plazasBus
    }
    constructor():this("AAAA000", 0, 2)

    override fun recibo() {
        println("------------------")
        println("BUS")
        println("------------------")
        super.recibo()
    }
    override fun alquiler(): Double {
        return ((this.duracion*50)+((1.5*this.numPlazas)*this.duracion)+(2*this.numPlazas))
    }
}
