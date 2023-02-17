package poo.tiendaProductos

abstract class Product{

    var regularPrice:Double = 0.0
    constructor(regularInitialPrice:Double){
        regularPrice=regularInitialPrice
    }
    abstract fun computeSalePrice():Double
    abstract fun computeSpecialCustomerPrice():Double
}