package poo.almacen

class AguaMineral(litroA:Double, precioA:Double, marcaA:String, var manantialOrigen: String):Bebida(litroA, precioA, marcaA) {
    constructor(otro:AguaMineral):this(otro.litros, otro.precio, otro.marca, otro.manantialOrigen)
    constructor(otro:BebidaAzucarada, manantialOrigen: String) : this(otro.litros, otro.precio, otro.marca, manantialOrigen)


    override fun toString(): String {
        return "${super.toString()} y su manantial de origen es $manantialOrigen"
    }
}