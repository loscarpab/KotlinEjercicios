package entornos.refactoriza3
abstract class Trabajador (var nombre: String, var horasExtras: Int = 0, var nomina:Int = 0) {
     abstract fun calcularSueldo():Int
}
