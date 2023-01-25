fun main(){
    println("Introduce un numero")
    val n1 = readLine()!!.toInt()
    println("Introduce otro numero")
    val n2 = readLine()!!.toInt()
    if (n1 < n2){
        println("$n2 es el mayor")
    }
    else{
        println("$n1 es el mayor")
    }
}