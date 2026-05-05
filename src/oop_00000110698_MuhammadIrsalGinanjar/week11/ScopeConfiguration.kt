package oop_00000110698_MuhammadIrsalGinanjar.week11

data class User(var name: String = "", var age: Int = 0)

fun main() {
    // ... (Code sebelumnya tetap ada)
    val user = User().apply { name = "Alex"; age = 25 }
    val numbers = mutableListOf(1, 2, 3).also { println("Log Sebelum: $it") }.apply { add(4) }

    println("\n=== TEST WITH ===")
    with(user) {
        println("User Detail -> Nama: $name, Umur: $age")
    }
}