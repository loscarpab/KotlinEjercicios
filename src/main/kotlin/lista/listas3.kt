package lista

fun main(){
    val listacadena = mutableListOf<Char>('c', 'a', 'd', 'e', 'n', 'a')
    val posiciones = mutableListOf<Int>()
    var eleccion = 1
    while (eleccion != 0) {
        for (i in 0..listacadena.size){
            posiciones.add(i)
        }
        println("Menu:\n1) Mostrar lista\n2) Insertar caracter en una posicion\n3) Actualizar (modificar) caracter en una posición\n4)Borrar caracter en una posición\n")
        eleccion = readln().toInt()
        while (eleccion < 0 || eleccion >= 6){
            println("Numero no esta en la lista\nMenu:\n1) Mostrar lista\n2) Insertar caracter en una posicion\n3) Actualizar (modificar) caracter en una posición\n4) Borrar caracter en una posición\n")
            eleccion = readln().toInt()
        }
        if (eleccion == 0){
            break
        }
        else if (eleccion == 1){
            println(listacadena)
            continue
        }
        else if (eleccion == 2){
            println(listacadena)
            println(posiciones)
            println("Introduce la posicion donde quieres añadir")
            var posicion = readln().toInt()
            while (posicion !in posiciones){
                println("Introduce una posicion correcta")
                posicion = readln().toInt()
            }
            println("Introduce lo que quieres añadir")
            var caracter = readln()!![0]
            listacadena.add(posicion, caracter)
            println(listacadena)
            continue
        }
        else if (eleccion == 3){
            println(listacadena)
            println(posiciones)
            println("Introduce la posicion que quieres cambiar")
            var posicioncambiar = readln().toInt()
            while (posicioncambiar !in posiciones){
                println("Introduce una posicion correcta")
                posicioncambiar = readln().toInt()
            }
            println("Introduce lo que quieres añadir")
            var caracter = readln()!![0]
            listacadena[posicioncambiar] = caracter
            println(listacadena)
            continue
        }
        else if (eleccion == 4){
            println(listacadena)
            println(posiciones)
            println("Introduce la posicion que quieres borrar")
            var posicionborrar = readln().toInt()
            while (posicionborrar !in posiciones){
                println("Introduce una posicion correcta")
                posicionborrar = readln().toInt()
            }
            listacadena.removeAt(posicionborrar)
            println(listacadena)
            continue
        }
        else if (eleccion == 5){
            println(listacadena)
            println("Introduce la posicion que quieres borrar")
            var caracter = readln()!![0]
            listacadena.remove(caracter)
            println(listacadena)
            continue
        }
        else if (eleccion == 6){
            println(listacadena)
            println("Introduce el valor que quieres quitar")
            var caractermodificado = readln()!![0]
            println("Introduce el valor que quieres modificar")
            var caractermodificar = readln()!![0]
            for (i in 0..listacadena.size - 1)
                if (listacadena[i]== caractermodificado){
                    listacadena[i] = caractermodificar
                }
            println(listacadena)
            continue
        }





    }
    }

