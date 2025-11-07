enum class DayOfTheWeek {
    Senin,
    Selasa,
    Rabu,
    Kamis,
    Jumat,
    Sabtu,
    Minggu
}

fun main() {
    val days = DayOfTheWeek.values()

    days.forEach {
        println("${it.ordinal}. ${it.name}")
    }

    println(DayOfTheWeek.valueOf("Senin"))
//    println(DayOfTheWeek.valueOf("senin"))

    val today = DayOfTheWeek.valueOf("Minggu")

    when(today) {
        DayOfTheWeek.Senin -> println("Yah, Senin lagi")
        DayOfTheWeek.Selasa -> println("Yah, Selasa lagi")
        DayOfTheWeek.Rabu -> println("Yah, Rabu lagi")
        DayOfTheWeek.Kamis -> println("Yah, Kamis lagi")
        DayOfTheWeek.Jumat -> println("Yah, Jumat lagi")
        else -> println("Hari Lain Selain Hari Kerja")
    }
}