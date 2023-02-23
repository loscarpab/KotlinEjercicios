package poo.tiendaProductos

abstract class Product(regularInitialPrice: Double, iva:Int) {

    var regularPrice:Double = regularInitialPrice
    var iva = iva
        get(){
            return field
        }
        set(value){
            var ivaIntroducido = value
            while (ivaIntroducido !in tramosIVA){
                println("Iva no valido. El iva debe de ser: 0, 4, 10 ó 21")
                ivaIntroducido = readln().toInt()
            }
            field = value
        }
    var numProduct = numProductoContador
    companion object{
        val tramosIVA = arrayOf<Int>(0,4,10,21)
        var numProductoContador = 1
    }
    init {
        numProductoContador++
        this.iva = iva
    }
    abstract fun computeSalePrice():Double
    abstract fun computeSpecialCustomerPrice():Double
    override fun toString(): String {
        return "Product(regularPrice=$regularPrice)"
    }
    fun ultimoObjeto():Int{
        return numProductoContador
    }
}