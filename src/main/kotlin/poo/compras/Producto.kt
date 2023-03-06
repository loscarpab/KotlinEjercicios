package poo.compras

abstract class Producto(nombreP:String, precioP: Double) {
    var nombre = nombreP
        get(){
            return field
        }
        set(value) {
            var nombre = value
            while (nombre.isEmpty()){
                println("Nombre vacio. Introduce un nombre")
            }
            field = nombre
        }
    var precio = precioP
        get(){
            return field
        }
        set(value) {
            var precio = value
            while (precio<0){
                println("Precio invalido. Introduce un nuevo precio")
            }
            field = precio
        }
    init {
        this.nombre = nombreP
        this.precio = precioP
    }
    open fun calcular():Double{
        return precio
    }
}