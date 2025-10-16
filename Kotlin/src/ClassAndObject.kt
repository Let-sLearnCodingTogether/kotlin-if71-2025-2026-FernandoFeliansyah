package oop

class MahasiswaConstructor(val npm: String, val nama: String, var ipk: Float) {

}

fun main() {
    val mahasiswaPertama = MahasiswaConstructor(
        npm = "2226250051",
        nama = "Fernando Feliansyah",
        ipk = 4f
    )

    println(mahasiswaPertama.npm)
    println(mahasiswaPertama.nama)
    println(mahasiswaPertama.ipk)

    mahasiswaPertama.ipk = 3.85f
    println(mahasiswaPertama.ipk)
}