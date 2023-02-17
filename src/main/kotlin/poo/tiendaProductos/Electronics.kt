package poo.tiendaProductos

abstract class Electronics(regularPrice: Double, var manufacturer:String): Product(regularPrice) {

    abstract override fun computeSalePrice(): Double
    abstract override fun computeSpecialCustomerPrice():Double
}