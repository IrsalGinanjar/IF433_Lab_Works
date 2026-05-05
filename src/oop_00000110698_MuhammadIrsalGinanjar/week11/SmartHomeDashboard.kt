package oop_00000110698_MuhammadIrsalGinanjar.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()
    SmartDevice("", "", false, 0).apply { name = "Philips WiZ Living Room"; category = "Lighting"; isOnline = true; powerLoad = 12 }.also { homeDevices.add(it) }
    SmartDevice("Ezviz Outdoor", "Camera").apply { isOnline = true; powerLoad = 5 }.also { println("(LOG) Kamera terhubung"); homeDevices.add(it) }
    homeDevices.add(run { SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800) })
    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    println("\n=== SMART HOME DASHBOARD ===")
    with(homeDevices) {
        println("Jumlah perangkat terdaftar: ${this.size}")
    }

    // 9. Kalkulasi Daya dengan run
    val totalPower = homeDevices.run { sumOf { it.powerLoad } }
    println("Estimasi Total Daya: $totalPower Watt")
}