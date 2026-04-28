package oop_00000110698_MuhammadIrsalGinanjar.week07

fun main() {
    println("\n=== TUGAS: RPG ENGINE ===")
    GameManager.startGame()

    println("\n=> Drop Chance Legendary: ${ItemRarity.LEGENDARY.dropChance}%")
    val starterWeapon = Weapon.forgeStarterSword()
    println("=> Senjata dibuat: ${starterWeapon.item.name} | Damage: ${starterWeapon.item.damage} | Durability: ${starterWeapon.durability}")
}