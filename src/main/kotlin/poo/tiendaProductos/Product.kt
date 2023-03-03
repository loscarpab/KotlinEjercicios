package poo.tiendaProductos

import poo.pruebaLinea.RelationInterface
import poo.tiendaProductosInterface.ProductInterface


abstract class Product(regularInitialPrice: Double, iva:Int):ProductInterface, RelationInterface {

    var regularPrice:Double = regularInitialPrice
    var iva = iva
        set(value){
            var ivaIntroducido = value
            while (ivaIntroducido !in tramosIVA){
                println("Iva no valido. El iva debe de ser: 0, 4, 10 ó 21")
                ivaIntroducido = readln().toInt()
            }
            field = value
        }
    var numProduct = numProductoContador
    companion object{
        val tramosIVA = arrayOf<Int>(0,4,10,21)
        var numProductoContador = 1
    }
    init {
        numProductoContador++
        this.iva = iva
    }
    override fun computeSalePrice():Double{
        return 0.0
    }
    abstract fun computeSpecialCustomerPrice():Double
    override fun toString(): String {
        return "Product(regularPrice=$regularPrice)"
    }
    fun ultimoObjeto():Int{
        return numProductoContador
    }

    override fun gettRegularPrice(): Double {
        return regularPrice
    }

    override fun settRegularPrice(regularPrice: Double) {
        this.regularPrice = regularPrice
    }

    override fun isEqual(otro: Any): Boolean {
        otro as Product
        return otro.regularPrice == this.regularPrice
    }
    override fun isLess(otro: Any): Boolean {
        otro as Product
        return otro.regularPrice > this.regularPrice
    }
    override fun isGreater(otro: Any): Boolean {
        otro as Product
        return otro.regularPrice < this.regularPrice
    }

}