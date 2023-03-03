package poo.person

class Person(var cashSaving: Int,var retirementFund:Int, var firstName:String, var lastName:String):PersonInterface, AnotherInterfaceExample {

    override fun computeTotalWealt():Int {
        return cashSaving + retirementFund
    }

    override fun getName():String {
        return firstName + "" + lastName
    }

    override fun measureIntelligence(name: String): Int {
        if(name=="Smart")
            return 100
        else
            return 50
    }
}