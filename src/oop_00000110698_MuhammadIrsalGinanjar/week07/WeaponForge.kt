package oop_00000110698_MuhammadIrsalGinanjar.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            return Weapon(GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON), 50)
        }

        fun forgeEpicSword(): Weapon {
            return Weapon(GameItem("Pedang Excalibur", 150, ItemRarity.EPIC), 1000)
        }
    }
}