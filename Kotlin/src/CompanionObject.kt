package oop

class Kalkulator {
    companion object {
        fun tambah(a: Int, b: Int) : Int {
            return a+b
        }
     }
}

fun main() {
    val kal = Kalkulator.Companion
    println(kal.tambah(5,2))
    println(Kalkulator.tambah(5, 2))
}