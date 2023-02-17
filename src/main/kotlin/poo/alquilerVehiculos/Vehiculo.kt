package poo.alquilerVehiculos

abstract class Vehiculo{
    protected var matricula = "AAAA000"
        get() {
            return field
        }
        set(value) {
            var matri = value
            while (!comprobarMatricula(matri)){
                println("Matricula erronea. Vuelve a introducir la matricula")
                matri = readln()
            }
            field = value
        }
     protected var duracion = 1
        get() {
            return field
        }
        set(value) {
            field = value
            while (field < 0){
                println("Duracion erronea. Vuelve a introducir la duración")
                readln()
            }
        }

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