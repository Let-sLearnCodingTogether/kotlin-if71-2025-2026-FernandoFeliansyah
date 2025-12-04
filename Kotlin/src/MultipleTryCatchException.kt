package Exeption

fun validasiUmur2(umur: Int): Int {
    if (umur < 0) {
        throw IllegalArgumentException("Umur")
    }
    return umur/0
}

fun main() {
    println("Start")
    try {
        validasiUmur2(10)
        validasiUmur2(-3)
    } catch (e: IllegalArgumentException) {
        println("Error dengan message ${e.message}")
    } catch (e: ArithmeticException) {
        println("Error pembagian dengan 0")
    } catch (e: Exception) {
        println("Error tidak diketahui ${e.message}")
    }
    println("Finish")
}
