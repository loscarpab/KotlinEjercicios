package POO.ejercicios5_12_cuentas

fun main(){
    var cuenta1 = Cuenta(122345, 0.00)
    var cuenta2 = Cuenta(54321, 700.00)
    var cuentasnpc = mutableListOf<Cuenta>(cuenta1, cuenta2)
    var npc = Persona("67327778G", cuentasnpc)
    cuenta1.recibirAbono(1100.00)
    cuenta2.realizarPagos(750.00)
    npc.moroso()
    cuenta1.transferenciaP(cuenta2, 500.00)
    cuenta1.consultarSaldo()
    cuenta2.consultarSaldo()

}