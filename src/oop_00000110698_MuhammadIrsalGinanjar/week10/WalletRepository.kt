package oop_00000110698_MuhammadIrsalGinanjar.week10

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    // Fungsi pencarian logis menggunakan predicate (Lambda)
    fun search(predicate: (T) -> Boolean): List<T> {
        return items.filter(predicate)
    }
}