package oop_00000110698_MuhammadIrsalGinanjar.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat ${device.name} berhasil ditambahkan ke Hub.")
    }

    fun turnOffAllSwitches() {
        println("\n=> Mematikan semua saklar...")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        println("\n=> MENGAKTIFKAN MODE KEAMANAN!")
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord()
            }
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}