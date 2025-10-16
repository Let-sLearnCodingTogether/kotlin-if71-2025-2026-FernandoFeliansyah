package oop

class MahasiswaConstructorDefaultValue(val npm: String, val nama: String, var ipk: Float = 0.0f) {
    init {
        println("Ini block init")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaConstructorDefaultValue(
        npm = "2226250051",
        nama = "Fernando Feliansyah"
    )

    val mahasiswaKedua = MahasiswaConstructorDefaultValue(
        npm = "2226250025",
        nama = "Andreyas"
    )

    val mahasiswaKetiga = MahasiswaConstructorDefaultValue(
        npm = "2226250018",
        nama = "Brilliant Chandra Pratama"
    )

    println(mahasiswaPertama.npm)
    println(mahasiswaPertama.nama)
    println(mahasiswaPertama.ipk)

    mahasiswaPertama.ipk = 3.85f
    println(mahasiswaPertama.ipk)
}