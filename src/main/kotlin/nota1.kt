fun main(){
    println("Introduce la nota")
    val num = readLine()!!.toInt()
    println("La nota introducida es $num")
    println("Has ${if (num > 5) "aprobado" else "suspenso" }")
}