package oop_00000110698_MuhammadIrsalGinanjar.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.15))
    coinRepo.add(Coin("ETH", 2.5))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== CRYPTO DASHBOARD ===")
    println("Status API: ${response.status}")
    response.data.forEach {
        println("Koin: ${it.name} | Saldo: ${it.balance}")
    }

    println("\n=== RIWAYAT TRANSAKSI ===")
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-1001", 500.0))
    txRepo.add(Transaction("TX-1002", 1250.5))
}