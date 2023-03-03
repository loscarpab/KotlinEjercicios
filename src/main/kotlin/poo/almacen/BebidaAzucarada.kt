package poo.almacen

class BebidaAzucarada(litroB:Double, precioB:Double, marcaB:String, var porcentajeAzucar: Double, var promocion:Boolean):Bebida(litroB, precioB, marcaB) {

    constructor(otro:BebidaAzucarada):this(otro.litros, otro.precio, otro.marca, otro.porcentajeAzucar, otro.promocion)
    constructor(otro:AguaMineral, porcentajeAzucar:Double, promocion:Boolean) : this(otro.litros, otro.precio, otro.marca, porcentajeAzucar, promocion)

    override fun calcular(cantidad_producto:Int):Double {
        if (promocion) {
            val descuento = 0.1
            return super.calcular(cantidad_producto) * (1 - descuento)
        }
        return super.calcular(cantidad_producto)
    }

    override fun toString(): String {
        var tiene = ""
        if (!promocion)
            tiene = "no "
        return "${super.toString()} ,su porcentaje de azúcar es de ${porcentajeAzucar*100}% y ${tiene}tiene promoción"
    }

}