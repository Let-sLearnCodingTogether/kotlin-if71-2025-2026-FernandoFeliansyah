fun main() {
    val mataKuliah : List<String> = listOf("Kotlin", "Kalkulus", "Algorimta dan Struktur Data")

    println("List matakuliah wajib : $mataKuliah")
    println("Size list matakuliah wajib : ${mataKuliah.size}")

    println("Index pertama matakuliah wajib : ${mataKuliah[0]}")

    val mataKuliahUppercase = mataKuliah.map {
        it.uppercase()
    }
    println("List matakuliah uppercase : $mataKuliahUppercase")

    val mataKuliahLebihDariNKarakter = mataKuliah.filter {
        it.length > 10
    }

    println("Matakuliah lebih dari 10 karakter : $mataKuliahLebihDariNKarakter")
}