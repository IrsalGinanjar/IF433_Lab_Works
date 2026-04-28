package oop_00000110698_MuhammadIrsalGinanjar.week08

fun main() {
    // ... (Test sebelumnya) ...

    println("\n=== TEST THE RED BUTTON (!!) ===")
    val toxicData: String? = null
    try {
        // DANGEROUS: Memaksa compiler percaya data ini tidak null
        val length = toxicData!!.length
    } catch (e: NullPointerException) {
        println("CRASH (NPE)! Jangan gunakan !! secara sembarangan.")
    }
}