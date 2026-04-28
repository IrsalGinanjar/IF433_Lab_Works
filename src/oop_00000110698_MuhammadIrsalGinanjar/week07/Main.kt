package oop_00000110698_MuhammadIrsalGinanjar.week07

fun main() {
    // ... (Test sebelumnya diabaikan saja biar hemat tempat, tambahkan di bawahnya)
    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1) // Otomatis readable format
    println("Sama? ${data1 == data2}") // True (Structural Equality)
}