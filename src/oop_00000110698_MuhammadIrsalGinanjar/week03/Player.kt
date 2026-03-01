package oop_00000110698_MuhammadIrsalGinanjar.week03

class Player(val username: String) {
    private var xp: Int = 0
    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val oldLevel = level
            xp += amount
            println("LOG: $username mendapatkan $amount XP (Total: $xp)")

            if (level > oldLevel) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        }
    }
}12