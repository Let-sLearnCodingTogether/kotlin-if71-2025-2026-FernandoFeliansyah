import kotlin.collections.component1
import kotlin.collections.component2

fun main() {
    val daftarJudulBuku : List<String> = listOf("Laskar Pelangi", "Bumi Manusia", "Filosofi Teras", "Laskar Pelangi")

    val koleksiGenre : Set<String> = setOf("Novel", "Filsafat", "Sejarah", "Novel")

    val inventarisBuku : MutableMap<String, String> = mutableMapOf(
        "978-602-03-8591-6" to "Laskar Pelangi",
        "978-979-3062-79-2" to "Bumi Manusia",
        "978-602-06-3534-7" to "Filosofi Teras",
        "978-602-03-8591-6" to "Laskar Pelangi",
    )

    println("1. Inisialisasi Data")
    println("List judul buku berhasil dibuat : $daftarJudulBuku")
    println("Set genre berhasil dibuat : $koleksiGenre")
    println("Map inventaris buku berhasil dibuat : $inventarisBuku")

    println(inventarisBuku.contains("978-979-3062-79-2"))
    inventarisBuku.put("978-623-91289-8-2", "Atomic Habits")
    println("Judul Buku dengan ISBN 978-979-3062-79-2 adalah : ${inventarisBuku.getValue("978-979-3062-79-2")}")
    println("Buku baru ${inventarisBuku.getValue("978-623-91289-8-2")} berhasil ditambahkan")
    inventarisBuku.entries.forEach {(key,value) ->
        println("Key : ${key}, Value : $value")
    }
    println("Isi inventaris sekarang ${inventarisBuku.entries}")
    println("Jumlah genre : ${koleksiGenre.size}")

    val judulIterator = daftarJudulBuku.iterator()
    while (judulIterator.hasNext()) {
//        val animal = judulIterator.next()
        println("Judul: ${judulIterator.next()}")
    }
}
