package poo.tiendaProductos

abstract class Electronics(regularPrice: Double, iva:Int, var manufacturer:String): Product(regularPrice, iva) {

    abstract override fun computeSalePrice(): Double
    abstract override fun computeSpecialCustomerPrice():Double
}