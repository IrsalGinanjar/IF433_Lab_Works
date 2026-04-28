package oop_00000110698_MuhammadIrsalGinanjar.week08

fun main() {
    // ... (Test sebelumnya) ...

    println("\n=== TEST THE RED BUTTON (!!) ===")
    val toxicData: String? = null
    try {
        val length = toxicData!!.length
    } catch (e: NullPointerException) {
        println("CRASH (NPE)! Jangan gunakan !! secara sembarangan.")
    }

    val apiResponse: Map<String, String?> = mapOf("status" to "200", "token" to null)
    try {
        // Alih-alih apiResponse["token"]!!
        val token = requireNotNull(apiResponse["token"]) {
            "CRITICAL EXCEPTION: Token otentikasi tidak ditemukan dari server!"
        }
    } catch (e: IllegalArgumentException) {
        println(e.message) // Mencetak pesan custom kita, bukan crash buta
    }
}