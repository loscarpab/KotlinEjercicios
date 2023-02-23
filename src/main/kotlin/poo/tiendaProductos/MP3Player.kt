package poo.tiendaProductos

class MP3Player(regularPrice:Double, iva:Int, manufacturer:String,  var color:String):Electronics(regularPrice, iva, manufacturer) {

    override fun computeSalePrice(): Double {
        return this.regularPrice * 0.9
    }

    override fun computeSpecialCustomerPrice(): Double {
        return computeSalePrice()-15
    }
}