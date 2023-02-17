package poo.alquilerVehiculos

abstract class VehiculoCarga:Vehiculo() {
    protected var tara = 1
        get(){
            return field
        }
        set(value){
            field = value
            while (field < 0){
                println("Tara incorrecta")
                readln()
            }
        }

    abstract override fun alquiler(): Double
    override fun recibo() {
        println("Matricula: ${matricula}\nDuración: ${duracion} dias\nPlazas:${tara} Toneladas\nImporte:${alquiler()}")
    }
}