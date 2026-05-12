package oop_00000110698_MuhammadIrsalGinanjar.week12

fun main() {
    println("=== TEST RUNCATCHING ===")

    // Checkpoint 6
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }

    // Checkpoint 7: Pattern getOrElse
    val safeValue = result.getOrElse { -1 }
    println("Safe Value (getOrElse): $safeValue")

    // Checkpoint 7: Pattern recover
    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered Value: $recovered")
}