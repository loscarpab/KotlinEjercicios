package POO.restaurante



open class Menu(iva: Double, descuento: Double, principal: String, bebida: Int, postre: Int) {
    val iva = 0.21
    var descuento = descuento
    var principal = principal
    var bebida = bebida
    var postre = postre
    protected var mapPrincipal = mapOf<String, Double>("Entrecot" to  15.00, "Pez Espada" to 12.00, "Carrillada" to 10.00 , "Dorada" to 20.00)
    protected val precioPrincipalOtro = 13.00
    private var mapBebida = mapOf<Int, Double>(1 to 1.00, 2 to  1.50)
    private val precioBebidaOtro = 2.00
    protected var mapPostre = mapOf<Int, Double>(1 to  2.00, 2 to 3.00)
    protected val precioPostreOtro = 2.00

    constructor() : this(0.21, 0.00, "", 0, 0)
    constructor(principal: String, bebida: Int, postre: Int):this(0.21, 0.00, principal, bebida, postre)

    protected fun precioPrincipal():Double{
        var precioPrincipal = 0.00
        if (principal in mapPrincipal.keys){
            precioPrincipal = mapPrincipal[principal]!!
        }
        else{
            precioPrincipal = precioPrincipalOtro
        }
        return precioPrincipal
    }
    private fun precioBebida():Double{
        var precioBebida = 0.00
        if (bebida in mapBebida.keys){
            precioBebida = mapBebida[bebida]!!
        }
        else{
            precioBebida = precioBebidaOtro
        }
        return precioBebida
    }

    protected fun precioPostre():Double{
        var precioPostre = 0.00
        if (postre in mapPostre.keys){
            precioPostre = mapPostre[postre]!!
        }
        else{
            precioPostre = precioPostreOtro
        }
        return precioPostre
    }
    fun importe():Double{
        var importeTotal = 0.00
        var ivaTotal = 0.00
        ivaTotal = (precioPrincipal() + precioBebida() + precioPostre())*iva
        importeTotal = (precioPrincipal() + precioBebida() + precioPostre()) + ivaTotal
        return importeTotal
    }
    fun mostrar(){
        println("Principal: $principal Precio ->${precioPrincipal()}\n Bebida: $bebida Precio ->${precioBebida()}\n Postre: $postre Precio ->${precioPostre()}\n Importe Total ----> ${importe()}")
    }


}