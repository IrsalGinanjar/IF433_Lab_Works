package oop_00000110698_MuhammadIrsalGinanjar.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    // ... [Kode sebelumnya tetap berjalan di background otak kita, tapi kita fokus ke Smart Home]

    println("\n=== TESTING SMART HOME INSTANTIATION ===")
    val myLamp = SmartLamp("L01", "Ruang Tamu")
    val mySpeaker = SmartSpeaker("S01", "Google Nest Dapur")
    val myCCTV = SmartCCTV("C01", "Ezviz Garasi")
}