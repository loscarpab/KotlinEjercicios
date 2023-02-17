package poo.tiendaProductos

class TV(regularPrice: Double, manufacturer:String, var size:Int):Electronics(regularPrice, manufacturer) {
    override fun computeSalePrice(): Double {
        return this.regularPrice * 0.8
    }
    override fun computeSpecialCustomerPrice(): Double {
        return computeSalePrice()-100
    }
}