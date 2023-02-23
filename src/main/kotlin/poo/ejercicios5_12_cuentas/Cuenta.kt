package poo.ejercicios5_12_cuentas

class Cuenta(saldoDisponiblec: Double) {
    var numeroCuenta: Int = numCuentaPred
    var saldoDisponible: Double = saldoDisponiblec
    companion object{
        var numCuentaPred = 21000001
    }
    init {
        numCuentaPred++
    }
    fun consultarSaldo(){
        println("Saldo ---> $saldoDisponible")
    }
    fun recibirAbono(dineroRecibir: Double) {
        this.saldoDisponible += dineroRecibir
        println("El dinero recibido es de: $dineroRecibir")
        println("Tu cuenta: ${this.numeroCuenta} dispone de: ${this.saldoDisponible}.")
    }
    fun realizarPagos(dineroPagar:Double){
        this.saldoDisponible -= dineroPagar
        println("El dinero pagado: $dineroPagar")
        println("Tu cuenta: ${this.numeroCuenta} dispone de: ${this.saldoDisponible}.")
    }
    fun transferenciaP(otraCuenta: Cuenta, dineroTransferido: Double){
        this.saldoDisponible -= dineroTransferido
        otraCuenta.saldoDisponible += dineroTransferido
        println("El dinero pagado: $dineroTransferido")
        println("Tu cuenta: ${this.numeroCuenta} dispone de: ${this.saldoDisponible}.")
    }
}