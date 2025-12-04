package Exeption

data class Barang(val nama: String, val stok: Int)

class StokHabisException(msg: String) : Exception(msg)

fun beliBarang(barang: Barang, jumlahBeli: Int){
    if (jumlahBeli > barang.stok) {
        throw StokHabisException("Stok hanya sisa ${barang.stok}")
    }
    println("Berhasil membeli $jumlahBeli ${barang.nama}")
}

fun main() {
    val barang = Barang("Barang1", 20)

    try {
        beliBarang(barang, 26)
    } catch (e: StokHabisException) {
        println("Error ${e.message}")
    }
}