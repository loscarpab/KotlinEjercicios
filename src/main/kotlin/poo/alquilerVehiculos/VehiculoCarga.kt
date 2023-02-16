package poo.alquilerVehiculos

abstract class VehiculoCarga(matriculaC:String, duracionC:Int, tara: Int):Vehiculo() {
    var tara = tara
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
    init {
        this.matricula = matriculaC
        this.duracion = duracionC
    }
    constructor():this("", 0, 0)
    abstract override fun alquiler(): Double
    override fun recibo() {
        println("Matricula: ${matricula}\nDuración: ${duracion} dias\nPlazas:${tara} Toneladas\nImporte:${alquiler()}")
    }
}