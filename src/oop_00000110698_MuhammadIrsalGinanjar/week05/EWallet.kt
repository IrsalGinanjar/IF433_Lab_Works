package oop_00000110698_MuhammadIrsalGinanjar.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran Rp$amount sukses. Sisa saldo: Rp$balance")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top Up Rp$amount berhasil. Saldo sekarang: Rp$balance")
    }
}