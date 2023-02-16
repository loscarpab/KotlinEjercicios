package poo.alquilerVehiculos

class Furgoneta(matriculaFurgo: String, duracionFurgo: Int, taraFurgo: Int):VehiculoCarga()  {
    init {
        this.matricula = matriculaFurgo
        this.duracion = duracionFurgo
        this.tara = taraFurgo
    }
    constructor():this("AAAA000", 0, 0)

    override fun recibo() {
        println("------------------")
        println("FURGONETA")
        println("------------------")
        super.recibo()
    }

    override fun alquiler(): Double {
        return ((50*this.duracion) + (20*this.tara))*1.00
    }
}