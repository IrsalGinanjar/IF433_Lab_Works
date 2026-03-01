package oop_00000110698_MuhammadIrsalGinanjar.week04;

open class Employee(val name: String, val baseSalary: Int) {
        open fun work() {
        println("$name sedang bekerja12.")
        }

        open fun calculateBonus(): Int {
        return (baseSalary * 0.1).toInt()
        }
        }
