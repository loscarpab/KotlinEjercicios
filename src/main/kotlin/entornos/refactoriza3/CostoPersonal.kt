package entornos.refactoriza3

class CostoPersonal{
    fun costoDelPersonal(trabajadores: Array<Trabajador>): Double {
        var costoFinal = 0.0
        for (trabajador in trabajadores){
            costoFinal += trabajador.calcularSueldo()
        }
        return costoFinal
    }
}
