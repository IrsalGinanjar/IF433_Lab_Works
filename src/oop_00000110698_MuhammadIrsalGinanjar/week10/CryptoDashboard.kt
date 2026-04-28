package oop_00000110698_MuhammadIrsalGinanjar.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.15))
    coinRepo.add(Coin("ETH", 2.5))
    coinRepo.add(Coin("USDT", 1500.0))
}