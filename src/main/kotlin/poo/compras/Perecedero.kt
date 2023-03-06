package poo.compras

class Perecedero(nombrePer:String, precioPer:Double, diasCaducarPer:Int):Producto(nombrePer, precioPer) {
    var diasCaducar = diasCaducarPer
        get(){
            return field
        }
        set(value){
            var dias = value
            while (dias < 0){
                println("Dias invalidos. Introduce de nuevo los dias")
            }
            field = dias
        }
    override fun calcular(): Double {
        when(diasCaducar){
            1 -> return super.calcular()/4
            2 -> return super.calcular()/3
            3 -> return super.calcular()/2
        }
        return super.calcular()
    }
}