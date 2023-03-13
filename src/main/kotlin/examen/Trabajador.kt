package examen

class Trabajador(nombreT:String, edadT:Int, sueldoT:Double, seguroSocialT:Double):Persona(nombreT, edadT) {
    var sueldo = sueldoT
        get() {
            return field
        }
        set(value) {
            var dinero = value
            while (dinero < 0){
                println("Salario negativo. Introduce un salario valido")
                dinero = readln().toDouble()
            }
            field = dinero
        }
    var seguroSocial = seguroSocialT
        get() {
            return field
        }
        set(value) {
            var dinero = value
            while (dinero < 0){
                println("Salario negativo. Introduce un salario valido")
                dinero = readln().toDouble()
            }
            field = dinero
        }

    override fun balanceMensual(): Double{
        return -(sueldo+seguroSocial)
    }

    override fun toString(): String {
        return "${super.toString()}, cobra $sueldo, y su seguro social $seguroSocial"
    }

}