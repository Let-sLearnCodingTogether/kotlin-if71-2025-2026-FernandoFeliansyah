fun main() {
    val finalExam = 'A'
    var a = 10
//    var status = false
    val nilaiLulus = arrayOf('A', 'B')

    when(finalExam) {
        'A' -> println("Lulus")
        'B' -> println("Oke")
        'C' -> println("Masih mending")
        else -> println("Ngulang")
    }

    when(finalExam) {
        'A', 'B' -> println("Lulus")
        'C' -> println("Masih mending")
        else -> println("Ngulang")
    }

    when {
        finalExam == 'A' || finalExam == 'B' -> println("Lulus")
        finalExam == 'C' -> println("Mungkin")
        else -> println("Ngulang")
    }

    when {
        a == 10 -> {
            a+= 2
            println(a)
        }
    }

//    when(finalExam) {
//        'A', 'B' -> status = true
//        else -> status = false
//    }
    val status = when(finalExam) {
        'A', 'B' -> true
        else -> false
    }

    println(status)

    when(finalExam) {
        in nilaiLulus -> println("Lulus")
        !in nilaiLulus -> println("Tidak lulus")
    }

    when(finalExam) {
        is Char -> println("Ya, ini char")
        is String -> println("Ya, ini String")
        !is Char -> println("bukan char")
    }
}