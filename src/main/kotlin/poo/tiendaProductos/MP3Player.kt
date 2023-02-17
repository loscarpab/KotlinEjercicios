package poo.tiendaProductos

class MP3Player(regularPrice:Double, manufacturer:String, var color:String):Electronics(regularPrice, manufacturer) {
    override fun computeSalePrice(): Double {
        return this.regularPrice * 0.9
    }

    override fun computeSpecialCustomerPrice(): Double {
        return computeSalePrice()-15
    }
}