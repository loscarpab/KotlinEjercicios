package entornos.refactoriza3

class Subdirector(var nombreS:String, var horasExtrasS: Int, var nominaS:Int):Trabajador(nombreS, horasExtrasS, nominaS) {
    override fun calcularSueldo():Int{
        return nomina
    }
}