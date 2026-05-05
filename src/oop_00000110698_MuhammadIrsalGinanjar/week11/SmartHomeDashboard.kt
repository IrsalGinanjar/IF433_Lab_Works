package oop_00000110698_MuhammadIrsalGinanjar.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    // 4. Konfigurasi Pencahayaan (apply & also)
    SmartDevice("", "", false, 0).apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also { homeDevices.add(it) }
}