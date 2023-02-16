package poo.alquilerVehiculos

class Camion(matriculaCamion: String, duracionCamion: Int, taraCamion: Int):VehiculoCarga()  {
    init {
        this.matricula = matriculaCamion
        this.duracion = duracionCamion
        this.tara = taraCamion
    }
    constructor():this("AAAA000", 0, 0)

    override fun recibo() {
        println("------------------")
        println("CAMIÓN")
        println("------------------")
        super.recibo()
    }

    override fun alquiler(): Double {
        return ((50*this.duracion) + (20*this.tara) + 40)*1.00
    }
}