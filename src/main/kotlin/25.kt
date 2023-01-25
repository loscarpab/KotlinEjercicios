fun main(args: Array<String>){
    println("Dime una frase")
    var frase = readLine()!!.toString()
    var masLargaNum = 0
    var maslarga = ""
    var palabras = frase.split(" ")
    var palabra = ""
    for (i in 0..palabras.size - 1){
        palabra = palabras[i]
        var longitud = 0
        for (i in 0..palabra.length - 1){
            longitud += 1
        }
        if (longitud > masLargaNum){
            masLargaNum = longitud
            maslarga = palabra
        }
    }
    println("La mas larga es $maslarga")
    println("Hay ${palabras.size} palabras")

}
