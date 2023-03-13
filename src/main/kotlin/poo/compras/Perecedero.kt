package poo.compras

class Perecedero(nombrePer:String, precioPer:Double, diasCaducarPer:Int):Producto(nombrePer, precioPer) {
    var diasCaducar = diasCaducarPer
        set(value){
            var dias = value
            while (dias < 0){
                println("Dias invalidos. Introduce de nuevo los dias")
                dias = readln().toInt()
            }
            field = dias
        }
    override fun calcular(cantidad:Int): Double {
        when(diasCaducar){
            1 -> return super.calcular(cantidad)/4
            2 -> return super.calcular(cantidad)/3
            3 -> return super.calcular(cantidad)/2
        }
        return super.calcular(cantidad)
    }

    override fun toString(): String {
        return "${super.toString()} Dias para que caduque -> $diasCaducar"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Perecedero) return false
        if (!super.equals(other)) return false


        if (diasCaducar != other.diasCaducar) return false

        return true
    }

    override fun hashCode(): Int {
        return diasCaducar
    }


}