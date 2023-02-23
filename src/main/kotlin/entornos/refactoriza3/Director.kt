package entornos.refactoriza3

class Director(var nombreD:String, var horasExtrasD: Int, var nominaD:Int):Trabajador(nombreD, horasExtrasD, nominaD) {
    override fun calcularSueldo():Int{
        return nomina
    }
}