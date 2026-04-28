package oop_00000110698_MuhammadIrsalGinanjar.week07

fun main() {
    println("\n=== TUGAS: RPG ENGINE ===")
    GameManager.startGame()

    val starterWeapon = Weapon.forgeStarterSword()

    println("\n=> Blacksmith Upgrade...")
    val upgradedItem = starterWeapon.item.copy(damage = 25)
    println("Senjata di-upgrade: ${upgradedItem.name} | Damage baru: ${upgradedItem.damage}")

    println("\n=> Simulasi Event Pertarungan...")
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}