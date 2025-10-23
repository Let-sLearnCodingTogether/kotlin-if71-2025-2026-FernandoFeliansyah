package oop

data class GameItem(val id: Int, val name: String, val value: Int, val rarity: String)

fun main() {
    val GameItemList : MutableList<Any> = mutableListOf(
        GameItem(1, "Pedang Besi", 100, "Common"),
        GameItem(1, "Pedang Besi", 100, "Common"),
        GameItem(1, "Pedang Besi", 100, "Common"),
    )

    GameItemList[1] = GameItem(1, "Pedang Besi", 100, "Common")
}