package POO.ejercicio5_11_libreria

class libro (titulo: String, autor: String, num_pag: Int, calificacion: Int){
    var titulo = titulo
    var autor = autor
    var num_pag = num_pag
    var calificacion = calificacion
        get(): Int = field
        set(valor){
            if (0<=calificacion && calificacion<=10){
                field = valor
            }
            else{
                println("Debes introducir un numero entre 0 y 10")
            }
        }

}