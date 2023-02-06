package POO.alarma

class RelojAlarma(reloj: Reloj, horaAlarma:Int, minutoAlarma:Int ){
    var reloj = reloj
    var horaAlarma = horaAlarma
    var minutoAlarma = minutoAlarma
    fun setTime(hora:Int, minuto:Int, segundo:Int){
        reloj.hora = hora
        reloj.minuto = minuto
        reloj.segundo = segundo
    }
    fun display(){
        println("Son las ${reloj.hora}:${reloj.minuto}:${reloj.segundo}")
    }
    fun tictac(){
        reloj.segundo += 1
        if (reloj.hora == horaAlarma && reloj.minuto == minutoAlarma && reloj.segundo == 0){
            println("Alarma sonando!!!")
        }
    }
}