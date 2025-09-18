fun main() {
    var totalBelanja : Double = 0.0

    totalBelanja += 3 * 25000
    println(totalBelanja)
    totalBelanja += 2 * 15000
    println(totalBelanja)
    totalBelanja -= 10000
    println(totalBelanja)
    var pajak =totalBelanja / 100

    println(pajak)
    totalBelanja+=pajak
    println(totalBelanja)
}