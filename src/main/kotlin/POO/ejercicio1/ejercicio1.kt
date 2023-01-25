package POO.ejercicio1



fun main(){
    val rectangulo1 = Rectangulo()
    rectangulo1.base = 3.0
    rectangulo1.altura = 2.0
    println("Rectangulo1")
    println(rectangulo1.area(rectangulo1.base, rectangulo1.altura))
    println(rectangulo1.perimetro(rectangulo1.base, rectangulo1.altura))
    val rectangulo2 = Rectangulo()
    rectangulo2.base = 5.0
    rectangulo2.altura = 4.0
    println("Rectangulo2")
    println(rectangulo2.area(rectangulo2.base, rectangulo2.altura))
    println(rectangulo2.perimetro(rectangulo2.base, rectangulo2.altura))
    val rectangulo3 = Rectangulo()
    rectangulo3.base = 10.0
    rectangulo3.altura = 25.0
    println("Rectangulo3")
    println(rectangulo3.area(rectangulo3.base, rectangulo3.altura))
    println(rectangulo3.perimetro(rectangulo3.base, rectangulo3.altura))
}
