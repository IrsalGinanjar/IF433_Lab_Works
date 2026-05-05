package oop_00000110698_MuhammadIrsalGinanjar.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("", "", false, 0).apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also { homeDevices.add(it) }

    // 5. Konfigurasi Keamanan (also & apply)
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }
}