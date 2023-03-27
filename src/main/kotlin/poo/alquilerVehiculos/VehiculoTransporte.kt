package poo.alquilerVehiculos

abstract class VehiculoTransporte:Vehiculo() {
    protected var numPlazas = 2
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

    abstract override fun alquiler(): Double
    override fun recibo() {
        println("Matricula: ${matricula}\nDuración: ${duracion} dias\nPlazas:${numPlazas}\nImporte:${alquiler()}")
    }

    override fun toString(): String {
        return "${super.toString()}numPlazas=$numPlazas"
    }


}