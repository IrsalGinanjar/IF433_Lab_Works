package oop_00000110698_MuhammadIrsalGinanjar.week06

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}