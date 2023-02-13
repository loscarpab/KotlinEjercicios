package POO.personas

fun main(){
    var programadorObj = Programador("nombrePro", "apellidop1 appellidop2", "1374862378D", "12/12/2022", 1000.0, 0.5,5)
    var directivoObj = Directivo("NombreDir", "apellidod1 apellidod2", "1422315F", "10/10/2020", 2500.0, 5.0, 0, 2.0, 1.0, "Presidente")
    println(directivoObj.imprimir_nomina())
    programadorObj.pedir_vacaciones()
    programadorObj.pedir_aumento()
    println(programadorObj.imprimir_nomina())
}