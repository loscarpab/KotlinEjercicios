package POO.restaurante

class MenuInfantil(regalo: String) : Menu() {
    private var mapBebida = mapOf<Int, Double>(1 to 1.00, 2 to  1.50)
    private val precioBebidaOtro = 2.00
    private val regalosArray = arrayOf<String>("Muñeca", "Soldado")
    var regalo = regalo

}