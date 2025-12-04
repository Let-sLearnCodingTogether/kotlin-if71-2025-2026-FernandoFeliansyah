package Exeption

fun validasiUmur(umur: Int) {
    if (umur < 0) {
        throw IllegalArgumentException("Umur")
    }
    println("Umur valid $umur")
}

fun main() {
    println("Start")
    validasiUmur(10)
    validasiUmur(-3)
    println("End")
}
