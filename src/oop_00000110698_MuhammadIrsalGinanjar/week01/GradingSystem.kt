package oop_00000110698_MuhammadIrsalGinanjar.week01

fun main() {
    // 1. Variabel dengan Refactor (val & type inference)
    val name = "John Thor"
    val score = 80

    // 2. String Template
    println("Nama: $name, Nilai: $score")

    // 3. Logika Grade menggunakan when (Range)
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")

    // 4. Memanggil Function (Expression Body)
    println("Status: ${calculateStatus(score)}")

    // 5. Null Safety & Elvis Operator (Ditambahkan di akhir main)
    val studentId: String? = null

    // Jika null, gunakan nilai default 0
    val idLength = studentId?.length ?: 0
    println("Panjang ID: $idLength")
}

// Function di luar main
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"