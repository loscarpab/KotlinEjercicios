package POO.ejercicio5_11_libreria

fun main(){
    var libro1: libro = libro("hola","yo",120,10)
    var libro2: libro = libro("hola2","yo",120,4)
    var libro3: libro = libro("hola","yo",120,10)
    var libro4: libro = libro("hola3","mipadre",120,7)
    var libreria = ConjuntoLibros(5)
    libreria.AnadirLibro(libro1)
    libreria.AnadirLibro(libro2)
    libreria.AnadirLibro(libro3)
    libreria.AnadirLibro(libro4)
    libreria.MostrarTodo()
    libreria.MejoryPeor()
    libreria.EliminarLibro("hola3", "mipadre")
    libreria.MostrarTodo()
}