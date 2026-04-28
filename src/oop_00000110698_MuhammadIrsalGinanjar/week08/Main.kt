package oop_00000110698_MuhammadIrsalGinanjar.week08

fun main() {
    // ... (Test sebelumnya) ...

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf("Smartphone", 1500000, UserProfile("Andi", null), "Laptop", 4500000.0)

    for (item in mixedData) {
        val text = item as? String
        text?.let { println("Ditemukan teks: ${it.uppercase()}") }
    }

    val someObject: Any = 100 // Tipe aslinya Integer
    // Coba cast ke String. Jika gagal (null), ganti dengan "Unknown String"
    val safeString = someObject as? String ?: "Unknown String"
    println("Hasil cast fallback: $safeString")
}