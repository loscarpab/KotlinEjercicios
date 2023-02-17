package poo.alquilerVehiculos

class Coche():VehiculoTransporte() {
        init {
            println("Introduce la matrícula")
            this.matricula = readln()
            println("Introduce la duración")
            this.duracion = readln().toInt()
            println("Introduce el numero de plazas")
            this.numPlazas = readln().toInt()
        }


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