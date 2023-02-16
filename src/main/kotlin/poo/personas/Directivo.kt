package poo.personas

class Directivo(nombreD: String, apellidosD: String,dniD: String ,fecha_contratoD: String, sueldo_baseD: Double, base_horas_extraD: Double,num_horas_extraD: Int,  plus_direccion: Double, dietas: Double, cargo: String) : Empleado() {
    var plus_direccion = plus_direccion
        get() {
            return field
        }
        set(value) {
            field = value
        }

    var dietas = dietas
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var cargo = cargo
        get() {
            return field
        }
        set(value) {
            field = value
        }

    init{
        this.nombre = nombreD
        this.apellidos = apellidosD
        this.dni = dniD
        this.fecha_contrato = fecha_contratoD
        this.sueldo_base = sueldo_baseD
        this.base_horas_extra = base_horas_extraD
        this.num_horas_extra = num_horas_extraD
        this.plus_direccion = plus_direccion
        this.dietas = dietas
        this.cargo = cargo
    }
    constructor():this( "", "", "", "", 0.0, 0.0, 0, 0.0,0.0,"")

    override fun calcular_sueldo(): Double{
        return super.calcular_sueldo() + plus_direccion + dietas
    }
    override fun imprimir_nomina(): String{
        return super.imprimir_nomina() + "\n Plus de dirección -> $plus_direccion\n Dietas -> $dietas\n Cargo ->$cargo"
    }
}