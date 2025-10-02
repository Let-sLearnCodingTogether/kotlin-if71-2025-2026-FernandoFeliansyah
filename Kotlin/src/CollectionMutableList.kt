fun main() {
    val mataKuliah : List<String> = listOf("Kotlin", "Kalkulus", "Algorimta dan Struktur Data")
    val mataKuliahPilihan : MutableList<String> = mutableListOf("Kotlin", "Logika Fuzzy")

    mataKuliahPilihan .add("Web 2")

    println(mataKuliahPilihan [1])

    mataKuliahPilihan .add(1, "Web 1")
    println(mataKuliahPilihan [1])

    mataKuliahPilihan .removeAt(1)
    println(mataKuliahPilihan )

    val mataKuliah2 = mataKuliahPilihan  + mataKuliah
    println(mataKuliah2)

//    val mataKuliahUppercase = mataKuliah.map {
//        it.uppercase()
//    }
//    println("List matakuliah uppercase : $mataKuliahUppercase")
//
//    val mataKuliahLebihDariNKarakter = mataKuliah.filter {
//        it.length > 10
//    }
//
//    println("Matakuliah lebih dari 10 karakter : $mataKuliahLebihDariNKarakter")
}