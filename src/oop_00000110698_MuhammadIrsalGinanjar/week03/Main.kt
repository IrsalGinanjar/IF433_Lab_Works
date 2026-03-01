package oop_00000110698_MuhammadIrsalGinanjar.week03

fun main() {
    println("--- TESTING EMPLOYEE ---")
    val emp = Employee("Budi")
    emp.salary = 5000.0
    emp.salary = -1000.0 // Akan muncul pesan error
    emp.setBonus(1500.0)
    println("Total Gaji ${emp.name}: ${emp.getTakeHomePay()}")

    println("\n--- TESTING PLAYER ---")
    val p1 = Player("GamerPro")
    p1.addXp(50)  // Masih level 1
    p1.addXp(60)  // Total 110, naik ke level 2
}