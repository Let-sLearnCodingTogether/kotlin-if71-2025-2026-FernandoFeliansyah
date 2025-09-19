fun main() {
    val mingguan : Array<String> = arrayOf("Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu")

    println("Jumlah hari : ${mingguan.size}")
    println("Hari Pertama : ${mingguan[0]}")
    println("Hari Terakhir : ${mingguan.get(6)}")
    mingguan.set(4, "Jum'at barokah")
    println("${mingguan[4]}")
}