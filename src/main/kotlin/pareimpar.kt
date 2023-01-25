fun main(){
    println("Introduce un numero")
    val numero = readLine()!!.toInt()
    if (numero%2 == 0){
        println("Es par")
    }
    else{
        println("Es impar")
    }
}