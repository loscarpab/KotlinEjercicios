package lista
fun main(){
    val bonoloto = mutableListOf<Int>()
    while (bonoloto.size < 5){
        println("Escribe numero")
        var numero = readln().toInt()
        while (numero in bonoloto) {
            println("Error")
            numero = readln().toInt()
        }
        bonoloto.add(numero)
    }
    println(bonoloto)
}
