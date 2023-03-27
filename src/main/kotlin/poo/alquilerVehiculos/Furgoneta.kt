package poo.alquilerVehiculos

class Furgoneta():VehiculoCarga()  {
    init {
        println("Introduce la matrícula")
        this.matricula = readln()
        println("Introduce la duración")
        this.duracion = readln().toInt()
        println("Introduce la tara")
        this.tara = readln().toInt()
    }


    override fun recibo() {
        println("------------------")
        println("FURGONETA")
        println("------------------")
        super.recibo()
    }

    override fun alquiler(): Double {
        return ((50*this.duracion) + (20*this.tara))*1.00
    }
    override fun toString(): String {
        println("Furgoneta")
        return super.toString()
    }
}