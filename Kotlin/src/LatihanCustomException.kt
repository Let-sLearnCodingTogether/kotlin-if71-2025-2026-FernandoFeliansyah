package Exeption

class NilaiTidakValidException(msg: String) : Exception(msg)

fun validasiNilai(nilai: Int) {
    if (nilai < 0 || nilai > 100) {
        throw NilaiTidakValidException("Nilai harus antara 0 hingga 100")
    }
    println("Nilai berhasil diinput $nilai")
}

fun main() {
    try {
        validasiNilai(105)
    } catch (e: NilaiTidakValidException) {
        println("Nilai error ${e.message}")
    }
}