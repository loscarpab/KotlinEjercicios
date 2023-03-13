package examen

fun main() {
    var newGYM = Gimnasio("GYM", "Cádiz")
    var trabajador1 = Trabajador("Paco", 18, 1000.00, 200.00)
    var trabajador2 = Trabajador("Pepe", 20, 1000.00, 220.00)
    var socio1 = Socio("Carlos", 19)
    var socioAct1 = SocioConActvidades("Antonio", 17)
    socioAct1.anadirActividadPosible("pilates")
    var socioAct2 = SocioConActvidades("Ismael", 19, mutableListOf(1,2,3,0,2,4))
    var socioPlus = SocioPlus("Jose", 34)
    newGYM.anadirPersonas(trabajador1)
    newGYM.anadirPersonas(trabajador2)
    newGYM.anadirPersonas(socio1)
    newGYM.anadirPersonas(socioAct1)
    newGYM.anadirPersonas(socioAct2)
    newGYM.anadirPersonas(socioPlus)
    newGYM.balanceTotal()
    socioAct1.apuntarseActividad()
    println(socioAct1.toString())
    socioAct1.apuntarseActividad()
    println(socioAct1.toString())
}