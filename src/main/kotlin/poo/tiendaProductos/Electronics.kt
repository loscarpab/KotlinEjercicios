package poo.tiendaProductos

import poo.tiendaProductosInterface.ElectronicsInterface

abstract class Electronics(regularPrice: Double, iva:Int, var manufacturer:String): Product(regularPrice, iva), ElectronicsInterface {

    abstract override fun computeSalePrice(): Double
    abstract override fun computeSpecialCustomerPrice():Double
    override fun gettManufacturer(): String {
        return manufacturer
    }
}