package POO.figuras

class Circle(radio:Double): Shape() {
    val radio = radio
    val diametro = radio*2
    val pi = 3.14159265359
    override fun area():Double{
        return pi*radio*radio
    }
    override fun perimetro():Double{
        return pi*diametro
    }

}