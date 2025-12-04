package Exeption

fun parseStringInt(input: String): Int {
    val hasil = try {
        input.toInt()
    } catch (e: NumberFormatException) {
        0
    }

    return hasil
}

fun main() {
    println(parseStringInt("1"))
    println(parseStringInt("TEST"))
}