package poo.figuras

class Rectangle(base: Double, altura: Double): Shape() {
    var base = base
    var altura = altura

    override fun area():Double{
        return base * altura
    }
    override fun perimetro():Double{
        return (base + altura) * 2
    }
}