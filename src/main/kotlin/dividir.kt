fun main(){
    println("Introduce el dividendo")
    val dividendo = readLine()!!.toInt()
    println("Introduce el divisor")
    val divisor = readLine()!!.toInt()
    if (divisor == 0){
        println("ERROR")
    }
    else{
        println("La division es ${dividendo/divisor}")
    }
    
}