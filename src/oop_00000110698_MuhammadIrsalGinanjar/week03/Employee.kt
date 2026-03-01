package oop_00000110698_MuhammadIrsalGinanjar.week03

class Employee(val name: String) {
    var salary: Double = 0.0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif!")
            } else {
                field = value
            }
        }


    private var _bonus: Double = 0.0


    fun setBonus(amount: Double) {
        if (amount >= 0) _bonus = amount
    }

    fun getTakeHomePay(): Double {
        return salary + _bonus
    }
}