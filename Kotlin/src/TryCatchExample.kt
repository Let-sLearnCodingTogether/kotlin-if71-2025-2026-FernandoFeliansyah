package Exeption

fun validasiUmur1(umur: Int) {
    if (umur < 0) {
        throw IllegalArgumentException("Umur")
    }
    println("Umur valid $umur")
}

fun main() {
    println("Start")
    try {
        validasiUmur1(10)
        validasiUmur1(-3)
    } catch (e: IllegalArgumentException) {
        println("Error dengan message ${e.message}")
    }
    println("Finish")
}
