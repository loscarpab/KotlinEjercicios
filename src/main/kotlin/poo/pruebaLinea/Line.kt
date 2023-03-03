package poo.pruebaLinea

class Line(var x1:Double, var x2:Double,var y1:Double,var y2:Double,):RelationInterface {
    fun getLength():Double{
        var length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1))
        return length
    }

    override fun isGreater(otro: Any): Boolean {
        otro as Line
        return otro.getLength() < this.getLength()
    }

    override fun isEqual(otro: Any): Boolean {
        otro as Line
        return otro.getLength() == this.getLength()
    }

    override fun isLess(otro: Any): Boolean {
        otro as Line
        return otro.getLength() > this.getLength()
    }
}