fun main(){
    println("Introduce tus ingresos")
    val ingresos = readLine()!!.toInt()
    println("Introduce tus gastos")
    val gastos = readLine()!!.toInt()
    val saldo = ingresos-gastos
    println("Tus ingresos son: $ingresos y tus gastos: $gastos")
    if (saldo > 0){
        println("Tienes $saldo")
    }
    else{
        println("Estas en numeros rojos")
    }
}