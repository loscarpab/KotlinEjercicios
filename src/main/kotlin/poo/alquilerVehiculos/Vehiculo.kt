package poo.alquilerVehiculos

abstract class Vehiculo(matricula: String, duracion: Int){
    var matricula = matricula
        get() {
            return field
        }
        set(value) {
            field = value
            while (!comprobarMatricula(field)){
                println("Matricula erronea")
                readln()
            }
        }
    var duracion = duracion
        get() {
            return field
        }
        set(value) {
            field = value
            while (field < 0){
                println("Duracion erronea")
                readln()
            }
        }
    constructor():this("AAAA000", 0)
    abstract fun alquiler():Double
    abstract fun recibo()


    private fun comprobarMatricula(matricula: String):Boolean{
        if (matricula.length != 7) return false
        else{
            for (indice in 0..matricula.length-1){
                //comprobar parte de letras
                if(indice<4){
                    if(matricula[indice] in 'A'..'Z') continue
                    else return false
                }
                else{
                    if (matricula[indice] in '0'..'9') continue
                    else return false
                }
            }
            return true
        }
    }
}