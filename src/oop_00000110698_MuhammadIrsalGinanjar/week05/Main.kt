package oop_00000110698_MuhammadIrsalGinanjar.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println()
    }

    println("=== TUGAS 1: MATH HELPER ===")
    val math = MathHelper()
    println("Luas Persegi (sisi 5): ${math.hitungLuas(5)}")
    println("Luas Persegi Panjang (5 x 10): ${math.hitungLuas(5, 10)}")
    println("Luas Lingkaran (jari 7.0): ${math.hitungLuas(7.0)}")
    println()

    println("=== TUGAS 2: SISTEM PEMBAYARAN ===")
    val myEWallet = EWallet("Isal EWallet", 50000.0)
    val myCreditCard = CreditCard("Isal CC", 100000.0)
    val paymentMethods: List<PaymentMethod> = listOf(myEWallet, myCreditCard)

    for (payment in paymentMethods) {
        println("Memproses pembayaran Rp75000 untuk: ${payment.accountName}")
        payment.processPayment(75000.0)

        // Smart Casting EWallet Challenge
        if (payment is EWallet) {
            println("=> Smart Casting terdeteksi EWallet. Melakukan Top Up...")
            payment.topUp(50000.0)
            payment.processPayment(75000.0)
        }
        println()
    }
}