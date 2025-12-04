package operatorOverloadingAndConvention

class GameCharacter(val inventory: List<String>) {
    operator fun contains(items: String): Boolean {
        return inventory.contains(items)
    }
}

fun main() {
    val hero = GameCharacter(listOf("Item A", "Item B", "Item C", "Item D"))

    println("Item A" in hero)
    println("Item B" in hero)
    println("Item C" in hero)
}