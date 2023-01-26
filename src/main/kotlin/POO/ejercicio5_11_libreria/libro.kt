package POO.ejercicio5_11_libreria

class libro (var titulo: String, var autor: String, var num_pag: Int, calificacion: Int){

    var nota = 0
        get(): Int = field
        set(valor){
            if (0<=nota && nota<=10){
                field = valor
            }
            else{
                println("Debes introducir un numero entre 0 y 10")
            }
        }
    init {
        nota = calificacion
    }
    constructor(libroCopia:libro):this(libroCopia.titulo, libroCopia.autor, libroCopia.num_pag, libroCopia.nota)

    override fun toString(): String {
        return "libro(titulo='$titulo', autor='$autor', num_pag=$num_pag, nota=$nota)"
    }


}