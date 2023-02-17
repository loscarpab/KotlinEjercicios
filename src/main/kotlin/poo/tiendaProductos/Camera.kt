package poo.tiendaProductos

class Camera(regularPrice: Double, manufacturer: String): Product(regularPrice) {
    override fun computeSalePrice(): Double {
        return this.regularPrice * 0.8
    }
    override fun computeSpecialCustomerPrice(): Double {
        return computeSalePrice()-15
    }
}