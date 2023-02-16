package poo.fabrica

class Producto(nombre: String, serie: Int, precio: Double) {
    var nombre = nombre
        get(){
         return  field
        }
        set(valor){

        }
    var serie = generar()
    var precio = precio
        get(){
            return field
        }
        set(valor){

        }


    constructor(): this("ABC",0 , 0.00)
    constructor(nombre: String, precio: Double):this() {
        while (nombre == "" || nombre == " ") {
            println("El nombre introducido es erroneo, Introduce un nombre nuevo")
            this.nombre = readln()
        }
        while (precio < 0.00) {
            println("El precio introducido es erroneo, Introduce un precio nuevo")
            this.precio = readLine()!!.toDouble()
        }
    }
    private fun generar(): Int{
        var serieG = (1..100000).random()
        return serieG
    }

}