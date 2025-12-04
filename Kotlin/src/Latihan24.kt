package operatorOverloadingAndConvention

data class Mana(val current: Int, val max: Int) {
    operator fun plus(other: Mana): Mana {
        return Mana(current + other.current, max + other.max)
    }

    operator fun inc(): Mana {
        return Mana(current + 10, max)
    }

    operator fun minus(other: Mana): Mana {
        return Mana(current - 30, max)
    }
}

fun main() {
    var mana1 = Mana(50, 100)
    val mana2 = Mana(20, 50)
    println(mana1+mana2)
    mana1++
    println(mana1++)
}