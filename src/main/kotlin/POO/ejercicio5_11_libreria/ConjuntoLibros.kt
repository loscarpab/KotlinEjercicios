package POO.ejercicio5_11_libreria

class ConjuntoLibros{
    var conjunto = mutableListOf<libro>()
        set(valor){
            if(conjunto.size > 5){
                println("Tamaño maximo alcanzado")
            }
            else{
                field = valor
            }
        }
    fun AnadirLibro(LibroNuevo: libro){
        var introducido = false
        if(this.conjunto.size > 5){
            println("Tamaño maximo alcanzado")
        }
        for(libros in this.conjunto)
            if(libros.titulo == LibroNuevo.titulo && libros.autor == LibroNuevo.autor){
                println("LIBRO YA INTRODUCIDO")
                introducido = true
                break
            }
        if(this.conjunto.size <= 5 && introducido == false) {
            this.conjunto.add(LibroNuevo)
            println("Libro introducido con exito.")
        }

    }
    fun EliminarLibro(tituloIntroducido: String, autorIntroducido: String) {
        for (libro in this.conjunto.indices) {
            if (this.conjunto[libro].titulo == tituloIntroducido && this.conjunto[libro].autor == autorIntroducido) {
                this.conjunto.remove(this.conjunto[libro])
            }
        }
    }
    fun MejoryPeor(){
        var indiceMejor = 0
        var indicePeor = 0
        for (i in this.conjunto.indices){
            if (this.conjunto[i].calificacion > this.conjunto[indiceMejor].calificacion) {
                indiceMejor = i
            }
            if (this.conjunto[i].calificacion < this.conjunto[indicePeor].calificacion){
                indicePeor = i
            }
        }
        println("El mejor valorado es ${this.conjunto[indiceMejor].titulo} de ${this.conjunto[indiceMejor].autor} con ${this.conjunto[indiceMejor].calificacion} de calificacion")
        println("El peor valorado es ${this.conjunto[indicePeor].titulo} de ${this.conjunto[indicePeor].autor} con ${this.conjunto[indicePeor].calificacion} de calificacion")
    }
    fun MostrarTodo(){
        for (libro in this.conjunto){
            println("Titulo:${libro.titulo}, Autor:${libro.autor}, Nº de Paginas:${libro.num_pag}, Calificacion:${libro.calificacion}")
        }
    }

}