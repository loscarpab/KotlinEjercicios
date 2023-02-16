package poo.alquilerVehiculos

private class Alquiler(pedidos: MutableList<Vehiculo>, nombreEmpresa: String):Alquilable {
    var pedidos = pedidos
        get(){
            return field
        }
        set(valor){
            field = valor
        }
    var nombreEmpresa = nombreEmpresa
        get(){
            return field
        }
        set(valor){
            field = valor
        }
    var tamanoPedidos = pedidos.size

    override fun importeTotal() {

    }
    fun importe(indice:Int){
        pedidos[indice].alquiler()
    }
}