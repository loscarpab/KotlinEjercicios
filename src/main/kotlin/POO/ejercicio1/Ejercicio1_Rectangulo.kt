package POO.ejercicio1

class Rectangulo {
    var base: Double = 0.0
    var altura: Double = 0.0
    fun area (base: Double, altura: Double):Double{
        return base*altura
    }
    fun perimetro (base: Double, altura: Double):Double{
        return (base*2)+(altura*2)
    }

}