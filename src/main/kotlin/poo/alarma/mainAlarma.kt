package poo.alarma

fun main(){
    var rolex = Reloj()
    rolex.setTime(25, 77,60)
    rolex.display()
    rolex.tictac()
    rolex.display()
    var casio = Reloj()
    var casioAlarma = RelojAlarma(casio, 18, 52)
    casioAlarma.setTime(18, 35,23)
    casio.display()

    for (i in 0..1000){
        casioAlarma.tictac()
        casioAlarma.display()
    }
}