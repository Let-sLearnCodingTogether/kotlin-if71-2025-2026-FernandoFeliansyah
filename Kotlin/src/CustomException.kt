package Exeption

class SaldoKurangException(msg: String) : Exception(msg)

val saldo: Int = 100_000

fun tarikTunai(jumlah: Int) {
    if (jumlah < saldo) {
        throw SaldoKurangException("Sadar diri")
    }
    println("Penarikan Berhasil")
}

fun main() {
    try {
        tarikTunai(200_000)
    } catch (e: SaldoKurangException) {
        println("Error saldo kurang ${e.message}")
    }
}