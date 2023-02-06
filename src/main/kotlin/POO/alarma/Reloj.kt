package POO.alarma

class Reloj(){
    var hora = 0
        set(valor) {
            if(valor > 24){
                hora = valor%24
            }
            else if(valor == 24){
                hora = 0
            }
            else field = valor
        }
    var minuto = 0
        set(valor) {
            if(valor > 60){
                minuto = valor%60
            }
            else if(valor == 60){
                minuto = 0
                hora += 1
            }

            else field = valor
        }
    var segundo = 0
        set(valor) {
            if(valor > 60){
                segundo = valor%60
            }
            else if(valor == 60){
                segundo = 0
                minuto += 1
            }
            else field = valor
        }
    fun setTime(hora:Int, minuto:Int, segundo:Int){
        this.hora = hora
        this.minuto = minuto
        this.segundo = segundo
    }
    fun display(){
        println("Son las $hora:$minuto:$segundo")
    }
    fun tictac(){
        segundo += 1
    }
}