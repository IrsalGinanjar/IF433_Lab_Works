package oop_00000110698_MuhammadIrsalGinanjar.week01

fun main() {
    // Langkah 1: Persiapan Data
    val gameTitle = "Monster Hunter Wilds" // Sesuai minatmu nih!
    val price = 750000

    // Langkah 4: Null Safety Challenge
    val userNote: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    // Langkah 3: Cetak Struk menggunakan Named Arguments
    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote ?: "Tidak ada catatan" // Langkah 4: Elvis Operator
    )
}

// Langkah 2: Logika Diskon (Expression Body)
// Harga > 500rb diskon 20%, selain itu 10%
fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

// Langkah 3: Fungsi Cetak Struk
fun printReceipt(title: String, finalPrice: Int, note: String) {
    println("--- Struk Pembelian SteamKW ---")
    println("Game: $title")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan: $note")
}