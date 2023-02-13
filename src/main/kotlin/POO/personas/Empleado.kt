package POO.personas

abstract class Empleado(fecha_contrato: String, sueldo_base:Double, base_horas_extra: Double, num_horas_extra: Int): Persona(){
    var fecha_contrato = fecha_contrato
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var sueldo_base = sueldo_base
        get() {
            return field
        }
        set(value) {
            field = value
            while (field < 0){
                println("El sueldo no puede ser negativo. Introduce un nuevo valor")
                readln().toInt()
            }
        }

    var base_horas_extra = base_horas_extra
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var num_horas_extra = num_horas_extra
        get() {
            return field
        }
        set(value) {
            field = value
        }

    constructor():this("", 0.0, 0.0, 0)

   open fun calcular_sueldo(): Double{
        return sueldo_base + (base_horas_extra*num_horas_extra)
    }
    open fun imprimir_nomina(): String{
        return super.mostrar_info() + "\n Fecha de contrato -> $fecha_contrato\n Sueldo base -> $sueldo_base\n Base de las horas extra ->$base_horas_extra\n Numro de horas extras -> $num_horas_extra"
    }

}