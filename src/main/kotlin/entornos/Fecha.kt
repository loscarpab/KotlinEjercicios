package entornos

class Fecha(private val dia: Int, private val mes: Int, private val anio: Int) {
    fun diavalido(): Boolean{
        if (dia < 1 || dia > 31){
            return false
        }
        return true
    }
    fun mesvalido(): Boolean{
        if (mes < 1 || mes > 12){
            return false
        }
        return true
    }
    private fun bisiestoFebrero():Int{
        if ((anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0)) return 29
        else return 28
    }
    fun diamesvalido(): Boolean{
        var diasMes = 0
        when (mes) {
            1, 3, 5, 7, 8, 10, 12 -> diasMes = 31
            4, 6, 9, 11 -> diasMes = 30
            2 -> diasMes = bisiestoFebrero()
        }
        return dia <= diasMes
    }
    fun valida(): Boolean {
        if (diavalido() == false) return false
        else if (mesvalido() == false) return false
        else return diamesvalido()
    }

}
