package oop

data class Player(val name: String, var health: Int = 100, var level: Int = 1) {
    fun takeDamage(damage: Int): Int {
        health -= damage
        if (health < 0) {
            health = 0
        }
        return health
    }

    fun levelUp() {
        level += 1
        health = 100
    }

    fun showStatus() {
        println("Nama : $name")
        println("Level : $level")
        println("Health : $health")
    }
}

fun main() {
    var player = Player("Fernando Feliansyah")
    player.showStatus()
    player.takeDamage(3000)
    player.showStatus()
    player.levelUp()
    player.showStatus()
}