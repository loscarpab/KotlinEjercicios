package poo.personas

abstract class Persona(nombre: String, apellidos: String, dni: String) {
    var nombre = nombre
        get() {
            return field
        }
        set(value) {
            field = value
            while (field == "" || field == " "){
                println("El nombre no puede estar vacio. Introduce un nuevo nombre")
                readln()
            }
        }
    var apellidos= apellidos
        get() {
            return field
        }
        set(value) {
            field = value
            while (field == "" || field == " "){
                println("Los apellidos no pueden estar vacio. Introduce unos apellidos correctos")
                readln()
            }
        }
    var dni = dni
        get() {
            return field
        }
        set(value) {
            field = value
            while (field == "" || field == " "){
                println("El dni no puede estar vacio. Introduce un dni nuevo")
                readln()
            }
        }
    constructor():this("", "", "")

    fun mostrar_info(): String{
        return " Nombre -> $nombre\n Apellidos -> $apellidos\n DNI -> $dni"
    }

    override fun toString(): String {
        return "Persona(nombre='$nombre', apellidos='$apellidos', dni='$dni')"
    }

}