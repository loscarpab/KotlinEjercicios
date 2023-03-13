package examen

class SocioPlus(nombreSP:String, edadSP:Int):Socio(nombreSP, edadSP) {
    override fun balanceMensual(): Double {
        if (edad < 18) return 40.00
        else return 60.00
    }

    override fun toString(): String {
        return super.toString()+" Está apuntado a "+this.mostrarActividadesString()
    }
}