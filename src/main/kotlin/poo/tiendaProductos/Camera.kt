package poo.tiendaProductos

class Camera(regularPrice: Double, iva:Int, manufacturer: String): Electronics(regularPrice, iva, manufacturer) {

    override fun computeSalePrice(): Double {
        return this.regularPrice * 0.8
    }
    override fun computeSpecialCustomerPrice(): Double {
        return computeSalePrice()-15
    }
}