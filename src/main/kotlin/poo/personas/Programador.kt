package poo.personas

class Programador(nombreP: String, apellidosP: String, dniP: String, fecha_contratoP: String, sueldo_baseP: Double, base_horas_extraP: Double, num_horas_extraP: Int): Empleado() {
    init{
        this.nombre = nombreP
        this.apellidos = apellidosP
        this.dni = dniP
        this.fecha_contrato = fecha_contratoP
        this.sueldo_base = sueldo_baseP
        this.base_horas_extra = base_horas_extraP
        this.num_horas_extra = num_horas_extraP
    }
    constructor():this( "", "", "", "", 0.0, 0.0, 0)

    fun pedir_vacaciones(){
        println("Hay que llegar a la siguiente entrega como sea, hasta entonces nadie puede coger vacaciones")
    }

    fun pedir_aumento(){
        println("El jefe de departamento está de vacaciones inténtelo de nuevo cuando vuelva")
    }

    override fun imprimir_nomina(): String {
        return super.imprimir_nomina()
    }
}