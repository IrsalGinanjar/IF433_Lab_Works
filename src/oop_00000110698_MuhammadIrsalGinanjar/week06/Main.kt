package oop_00000110698_MuhammadIrsalGinanjar.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()
    val myPhone = Smartphone()
    myPhone.turnOn()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(Gopay(), 50000.0)

    println("\n=== TESTING SMART HOME SYSTEM ===")
    val myLamp = SmartLamp("L01", "Ruang Tamu")
    val mySpeaker = SmartSpeaker("S01", "Google Nest Dapur")
    val myCCTV = SmartCCTV("C01", "Ezviz Garasi")

    val hub = SmartHomeHub()
    hub.addDevice(myLamp)
    hub.addDevice(mySpeaker)
    hub.addDevice(myCCTV)

    // Menyalakan manual untuk test
    myLamp.turnOn()
    mySpeaker.turnOn()
    myCCTV.turnOn()

    // Test integrasi Hub
    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}