package oop_00000110698_MuhammadIrsalGinanjar.week07

fun main() {
    val data1 = DataUser("Alice", 22)

    println("\n=== TEST COPY & DESTRUCTURING ===")
    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1 // Destructuring Declaration
    println("Destructured: $userName berumur $userAge")
}