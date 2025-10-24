package oop

class Karyawan(val nama: String, val id: String, val gajiPokok: Double) {
    fun tampilkanProfil() {
        println("Nama $nama, Id Karyawan: $id")
    }

    fun hitungGajiBulanan(jumlahHariMasuk: Int): Double {
        return (jumlahHariMasuk.toDouble()/22)*gajiPokok
    }
}

fun main() {
    val karyawanA = Karyawan("Fernando 1", "K001", 5000000.0)
    val karyawanB = Karyawan("Fernando 2", "K002", 4500000.0)
    println(karyawanA.tampilkanProfil())
    println(karyawanA.hitungGajiBulanan(20))

    println(karyawanA.tampilkanProfil())
    println(karyawanA.hitungGajiBulanan(22))

}