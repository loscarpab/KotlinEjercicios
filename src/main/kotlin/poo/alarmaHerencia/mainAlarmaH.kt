package poo.alarmaHerencia

fun main(){
    var casio = AlarmaH()
    casio.setAlarm(18, 52)
    casio.setTime(18, 35, 23)
    casio.display()
    for (i in 0..1000){
        casio.tictac()
        casio.display()
    }
}