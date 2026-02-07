package oop_00000110698_MuhammadIrsalGinanjar.week01

fun main() {
    // Langkah 2: Menggunakan val, type inference, dan String Template
    val radius = 7.0
    val pi = 3.14
    val area = pi * radius * radius

    println("Radius: $radius, Area: $area")


    println(checkSize(area))
}


fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"