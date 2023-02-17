package poo.tiendaProductos

class Book(var publisher:String,var yearPublished:Int, regularPrice:Double):Product(regularPrice) {
    override fun computeSalePrice(): Double {
        return this.regularPrice * 0.5
    }
    override fun computeSpecialCustomerPrice(): Double {
        return computeSalePrice()-2
    }
}