package POO.ejercicios5_12_cuentas

class Persona(dni: String, listaCuentas: MutableList<Cuenta>) {
    var dni = dni
    var cuentas = listaCuentas
    val maxCuentas = 3

    fun anadirCuenta(nuevaCuenta: Cuenta){
        var introducido = false
        if(this.cuentas.size > maxCuentas){
            println("Tamaño maximo alcanzado")
        }
        for(cuenta in this.cuentas)
            if(cuenta.numeroCuenta == nuevaCuenta.numeroCuenta){
                println("ESTA CUENTA YA EXISTE")
                introducido = true
                break
            }
        if(this.cuentas.size <= 5 && introducido == false) {
            this.cuentas.add(nuevaCuenta)
            println("Libro introducido con exito.")
        }
    }
    fun moroso(){
        for (cuenta in this.cuentas){
            if (cuenta.saldoDisponible < 0){
                println("Eres un moroso tienes una deuda de ${cuenta.saldoDisponible} en la cuenta: ${cuenta.numeroCuenta}")
            }
        }
    }
}