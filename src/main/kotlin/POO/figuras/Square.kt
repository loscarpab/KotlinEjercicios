package POO.figuras


class Square(lado: Double): Shape() {
    var lado = lado

    override fun area():Double{
        return lado * lado
    }
    override fun perimetro():Double{
        return lado * 4
    }
}