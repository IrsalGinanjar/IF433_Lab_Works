package oop_00000110698_MuhammadIrsalGinanjar.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Awas! Seekor ${event.monsterName} muncul!")
        is BattleState.LootDropped -> println("Kamu mendapatkan loot: ${event.item.name} (${event.item.rarity})!")
        is BattleState.GameOver -> println("GAME OVER: ${event.reason}")
        BattleState.SafeZone -> println("Kamu memasuki zona aman. HP dipulihkan.")
    }
}