package oop_00000110698_MuhammadIrsalGinanjar.week11

data class User(var name: String = "", var age: Int = 0)

fun main() {
    // ... (Test apply, also, with dari langkah 7, 8, 9 biarkan di sini jika mau, atau timpa dengan kode di bawah ini saja)
    println("=== TEST GABUNGAN ===")
    val newUser = User("Budi", 20).apply {
        age = 21 // Mengubah umur
    }.also {
        println("User baru berhasil dibuat: $it")
    }
}