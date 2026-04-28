package oop_00000110698_MuhammadIrsalGinanjar.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}