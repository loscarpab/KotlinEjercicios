package entornos
fun main() {
    val numAlumnos = 40
    val control = Array(numAlumnos) { 0 }
    var postEval = 0

fun generarNotasAleatorias(array: Array<Int>) {
    for (i in array.indices) {
        array[i] = (1..10).random()
    }
}
    generarNotasAleatorias(control)

// Busca la nota más alta
fun notaMasAlta(array: Array<Int>):Int{
    var maxNota = 0
    var max = array[0];
    for (i in array.indices) {
        if (array[i] > max) {
            max = array[i];
        }
    }
    postEval = max;
    maxNota = postEval


    return max

}
    println(notaMasAlta(control))

fun notaMasBaja(array: Array<Int>): Int{
    var minNota = 10
    postEval = 10
    for (i in array.indices) {
        val preEval = array[i]
        if (preEval < postEval) {
            minNota = preEval
            postEval = preEval

        }
    }
    return minNota
}
    println(notaMasBaja(control))
fun crearClase():IntArray{
    val listaClase = IntArray(numAlumnos) { it + 1 }
    return listaClase
}
fun pasarNotasaLista(array: Array<Int>):List<Int>{
    val array: List<Int> = control.toList()
    return array
}

// Comprueba el resultado del ejercicio
    println("Mínimo es: ${notaMasBaja(control)}")
    println("Máximo es: ${notaMasAlta(control)}")
    println("Lista de clase: ${crearClase().toString()}")
    println("Array de Notas: ${pasarNotasaLista(control)}")

fun crearListaPracticas():IntArray{
    val practicas = IntArray(numAlumnos) { (1..10).random() }
    return practicas
}
    val practicas = crearListaPracticas()
// Crea el vector calificaciones
    val calificaciones = FloatArray(numAlumnos)
    for (i in control.indices) {
        calificaciones[i] = (control[i] + practicas[i]) / 2.0f
    }

    println("Prácticas: ${practicas.toString()}")
    println("Calificaciones: ${calificaciones.toString()}")

// Sacamos la estadística de calificaciones
// Hacemos un array de 10 para la estadística.
    val estadistica = FloatArray(10)

    for (i in 0..9) {
        var count = 0f
        var sum = 0f
        for (j in control.indices) {
            if (i < calificaciones[j] && i + 1 >= calificaciones[j]) {
                sum += calificaciones[j]
                count += 1
            }
        }
        estadistica[i] = if (count != 0f) {
            count / numAlumnos
        } else {
            0f
        }
        val sol = (Math.round(estadistica[i] * 10000.0) / 100.0).toDouble()
        println("Estadística nota tramo <= ${i + 1} = $sol%")
    }

fun num_aprobados():Int{
    val aprobados = IntArray(numAlumnos)
    var countAprobados = 0
    for (i in control.indices) {
        if (calificaciones[i] < 5) {
            aprobados[countAprobados] = i + 1
            countAprobados++
        }
    }
    return countAprobados
}
    fun num_suspensos():Int{
        val suspensos = IntArray(numAlumnos)
        var countSuspensos = 0
        for (i in control.indices) {
            if (calificaciones[i] < 5) {
                suspensos[countSuspensos] = i + 1
                countSuspensos++
            }
        }
        return countSuspensos
    }

}