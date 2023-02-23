package poo.tiendaProductos

class Book(var publisher:String, iva:Int,var yearPublished:Int, regularPrice:Double):Product(regularPrice, iva) {

    override fun computeSalePrice(): Double {
        return this.regularPrice * 0.5
    }
    override fun computeSpecialCustomerPrice(): Double {
        return computeSalePrice()-2
    }
}