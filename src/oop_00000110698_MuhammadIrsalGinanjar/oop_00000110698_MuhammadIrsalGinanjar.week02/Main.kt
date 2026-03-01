package oop_00000110698_MuhammadIrsalGinanjar.oop_00000110698_MuhammadIrsalGinanjar.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)


    println("--- APLIKASI PMB UMN ---")
    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()
    scanner.nextLine()


    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()


        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai untuk ${s1.name}")
    }

    println("\n--- TUGAS MANDIRI: HERO GAME ---")

    print("Nama Hero: ")
    val heroName = scanner.next()
    print("Damage Hero: ")
    val heroDamage = scanner.nextInt()

    val myHero = Hero(heroName, heroDamage)
    var enemyHp = 100

    while (myHero.isAlive() && enemyHp > 0) {
        println("\nHP Hero: ${myHero.hp} | HP Musuh: $enemyHp")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        when (scanner.nextInt()) {
            1 -> {

                enemyHp -= myHero.damage
                println("Anda menyerang musuh sebesar ${myHero.damage}!")

                if (enemyHp > 0) {

                    val enemyDamage = (10..20).random()
                    myHero.takeDamage(enemyDamage)
                    println("Musuh membalas! Anda terkena $enemyDamage damage.")
                }
            }
            2 -> {
                println("Anda memilih kabur dari pertarungan!")
                break
            }
            else -> println("Pilihan tidak valid!")
        }
    }


    if (enemyHp <= 0) {
        println("\nSELAMAT! Musuh telah dikalahkan.")
    } else if (!myHero.isAlive()) {
        println("\nGAME OVER! Hero Anda telah gugur.")
    }
}