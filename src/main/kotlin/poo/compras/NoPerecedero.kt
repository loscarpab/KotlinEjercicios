package poo.compras

class NoPerecedero(nombreNo:String, precioNo:Double, var tipo: String):Producto(nombreNo, precioNo){
    companion object{
        var tipos = mutableListOf<String>("Bebidas","Legumbre", "Verduras")
    }
    init {
        if(tipo !in tipos) tipo = "otro"
    }

    override fun toString(): String {
        return "${super.toString()} Tipo -> $tipo"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NoPerecedero) return false
        if (!super.equals(other)) return false

        if (tipo != other.tipo) return false

        return true
    }

    override fun hashCode(): Int {
        return tipo.hashCode()
    }

}