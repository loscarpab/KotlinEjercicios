package poo.figuras

class Circle(radio:Double): Shape(), Printable {
    private val radio = radio
    private val pi = 3.14159265359
    private  fun obtenerDiametro(): Double{
        return radio*2
    }
    override fun area():Double{
        return pi*radio*radio
    }
    override fun perimetro():Double{
        return pi*obtenerDiametro()
    }

    override fun printScreen() {
        TODO("Not yet implemented")
    }

}