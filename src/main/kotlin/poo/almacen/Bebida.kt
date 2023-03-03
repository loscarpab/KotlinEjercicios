package poo.almacen

abstract class Bebida(litros:Double, precio:Double , marca:String) {
    var litros:Double = litros
        get(){
            return field
        }
        set(value) {
            var litro = value
            while(litro<=0){
                println("Litros introducidos erroneos")
                litro = readln().toDouble()
            }
            field = value
        }
    var precio:Double = precio
        get(){
            return field
        }
        set(value) {
            var precio = value
            while(precio<0){
                println("Precio introducido erroneo")
                precio = readln().toDouble()
            }
            field = value
        }
    var marca:String = marca
        get(){
            return field
        }
        set(value) {
            var marca = value
            while(marca == "" || marca == " "){
                println("Precio introducido erroneo")
                marca = readln()
            }
            field = value
        }
    var id = contador_id
    init {
        contador_id++
        this.litros = litros
    }
    companion object{
        var contador_id = 1
    }

    open fun calcular(cantidad_producto:Int):Double{
        var precioFinal = cantidad_producto*precio
        return precioFinal
    }

    override fun toString(): String {
        return "$id -> $marca de ${litros} L, su precio es de ${precio} €"
    }

}