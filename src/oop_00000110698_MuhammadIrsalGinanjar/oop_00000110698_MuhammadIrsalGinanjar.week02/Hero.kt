package oop_00000110698_MuhammadIrsalGinanjar.oop_00000110698_MuhammadIrsalGinanjar.week02


class Hero(val name: String, val damage: Int) {
    var hp: Int = 100


    fun takeDamage(amount: Int) {
        hp -= amount
        if (hp < 0) hp = 0
    }


    fun isAlive(): Boolean {
        return hp > 0
    }
}