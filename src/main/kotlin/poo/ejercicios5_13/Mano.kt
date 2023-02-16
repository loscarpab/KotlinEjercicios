package poo.ejercicios5_13

import Carta

class Mano(tamaño: Int) {
    var tamaño = 3
    var tresCartas = mutableListOf<Carta>()
    constructor(): this(3){
        for (carta in 0..tamaño - 1){
            val palos = arrayListOf<Char>('C', 'P', 'R', 'T')
            val cartapalo = palos.random()
            val numeros = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13)
            val cartanumero = numeros.random()
            val carta = Carta(cartanumero, cartapalo)
            tresCartas.add(carta)
        }

        }
    fun mostrarMano(){
        for (carta in tresCartas){
            carta.mostrarCarta()
        }
    }
    fun mostrarTamaño(){
        println("El tamaño de tu mano es$tamaño")
    }
    fun mostrarCartaMano(posicion: Int){
        println("Esta carta es ${tresCartas[posicion]}")
    }
    fun actualizarCartaMano(posicion: Int, carta: Carta){
        tresCartas[posicion] = carta
    }
    fun pedirCarta(carta: Carta){
        if (tresCartas.size >= 3){
            println("Tu mano ya tiene 3 cartas")
        }
        else{
            tresCartas.add(carta)
        }
    }
    fun manoGanadora(mano: Mano):Int{
        var ganador = 0
        for (i in 0..3){
            ganador += this.tresCartas[i].compararCarta(mano.tresCartas[i])
        }
        if (ganador > 0){
            println("La mano ganadora es:${mano.mostrarMano()}")
            return 1
        }
        else{
            println("La mano ganadora es:${this.mostrarMano()}")
            return -1
        }

    }


}