package poo.compras

abstract class Producto(nombreP:String, precioP: Double) {
    var nombre = nombreP
        set(value) {
            var nombre = value
            while (nombre.isEmpty()){
                println("Nombre vacio. Introduce un nombre")
                nombre = readln()
            }
            field = nombre
        }
    var precio = precioP
        set(value) {
            var precio = value
            while (precio<0){
                println("Precio invalido. Introduce un nuevo precio")
                precio = readln().toDouble()
            }
            field = precio
        }
    init {
        this.nombre = nombreP
        this.precio = precioP
    }
    open fun calcular(cantidad:Int):Double{
        return precio*cantidad
    }

    override fun toString(): String {
        return "$nombre: Precio -> $precio"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Producto) return false

        if (nombre != other.nombre) return false
        if (precio != other.precio) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nombre.hashCode()
        result = 31 * result + precio.hashCode()
        return result
    }


}