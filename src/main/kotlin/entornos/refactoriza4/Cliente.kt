package VideoClub

class Cliente(val nombre: String) {
    private val alquileres = mutableListOf<Pelicula>()
    fun alquiler(pelicula: Pelicula){
        alquileres.add(pelicula)
    }
    fun mostrarAlquiler(): MutableList<Pelicula>{
        return alquileres
    }
}