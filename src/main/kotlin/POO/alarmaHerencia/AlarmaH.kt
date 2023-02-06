package POO.alarmaHerencia


class AlarmaH () : RelojH() {
    var horaAlarma = 0
    var minutoAlarma = 0

    fun setAlarm(hora:Int, minuto:Int){
        this.horaAlarma = hora
        this.minutoAlarma = minuto
    }
    override fun tictac(){
        if (super.hora == horaAlarma && super.minuto == minutoAlarma && super.segundo == 0){
            println("Alarma sonando!!!")
        }
        super.tictac()
    }
}