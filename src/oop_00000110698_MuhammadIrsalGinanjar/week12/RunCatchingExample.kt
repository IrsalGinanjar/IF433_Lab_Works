package oop_00000110698_MuhammadIrsalGinanjar.week12

fun main() {
    println("=== TEST RUNCATCHING ===")

    // Checkpoint 6
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }

    // Checkpoint 7
    val safeValue = result.getOrElse { -1 }
    println("Safe Value (getOrElse): $safeValue")

    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered Value: $recovered")

    // Checkpoint 8: Chaining
    runCatching {
        "100".toInt()
    }.onSuccess { v ->
        println("Berhasil dikonversi: $v")
    }.onFailure { e ->
        println("Gagal konversi: ${e.message}")
    }
}