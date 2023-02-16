package poo.alquilerVehiculos

abstract class VehiculoTransporte(matriculaT:String, duracionT:Int, numPlazas: Int):Vehiculo() {
    var numPlazas = numPlazas
        get(){
            return field
        }
        set(value){
            field = value
            while (field < 2){
                println("Numero de plaza incorrecto")
                readln()
            }
        }

    init {
        this.matricula = matriculaT
        this.duracion = duracionT
    }
    constructor():this("AAAA000", 0, 2)
    abstract override fun alquiler(): Double
    override fun recibo() {
        println("Matricula: ${matricula}\nDuración: ${duracion} dias\nPlazas:${numPlazas}\nImporte:${alquiler()}")
    }
}