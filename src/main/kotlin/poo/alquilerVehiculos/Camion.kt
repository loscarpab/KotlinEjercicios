package poo.alquilerVehiculos

class Camion():VehiculoCarga()  {
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
        println("CAMIÓN")
        println("------------------")
        super.recibo()
    }

    override fun alquiler(): Double {
        return ((50*this.duracion) + (20*this.tara) + 40)*1.00
    }

    override fun toString(): String {
        println("Camion")
        return super.toString()
    }
}