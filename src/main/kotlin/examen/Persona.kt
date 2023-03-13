package examen

abstract class Persona(nombreP:String, edadP:Int){
    var nombre = nombreP
        get() {
            return field
        }
        set(value) {
            var name = value
            while (name.isEmpty()){
                println("Nombre vacio. Por favor introduzca un nombre")
                name = readln()
            }
            field = name
        }
    var edad = edadP
        get() {
            return field
        }
        set(value) {
            var age = value
            while (age<16){
                println("No puede tener menos de 16 años. Introduzca una edad valida")
                age = readln().toInt()
            }
            field = age
        }
    abstract fun balanceMensual():Double
    override fun toString(): String {
        return "$nombre, $edad años"
    }
}