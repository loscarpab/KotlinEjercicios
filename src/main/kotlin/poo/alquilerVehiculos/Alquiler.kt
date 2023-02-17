package poo.alquilerVehiculos

 class Alquiler:Alquilable {
    var pedidos = mutableListOf<Vehiculo>()
        get(){
            return field
        }
        set(valor){
            field = valor
        }
    var nombreEmpresa = ""
        get(){
            return field
        }
        set(valor){
            field = valor
        }
    private var tamanoPedidos = pedidos.size
        get(){
            return field
        }
        set(valor){
            field = valor
            while (field < 0){
                println("Tamaño introducido erroneo")
                readln().toInt()
            }
        }
    constructor(tamanopedidos:Int){
        tamanoPedidos = tamanopedidos
        for(i in 0 until tamanopedidos){
            var tipoCoche = 0
            println(
                "Seleccione el tipo de vehiculo" +
                        "\n1)Coche" +
                        "\n2)Bus" +
                        "\n3)Furgoneta" +
                        "\n4)Camión"
            )
            tipoCoche = readln().toInt()
            when(tipoCoche){
                1 -> pedidos.add(Coche())
                2 -> pedidos.add(Bus())
                3 -> pedidos.add(Camion())
                4 -> pedidos.add(Furgoneta())
            }
        }
    }
    override fun importeTotal() {
        for (vehiculo in pedidos){
            vehiculo.recibo()
        }
    }
    fun importe(indice:Int){
        pedidos[indice].alquiler()
    }
}