package oop

class Mahasiswa(ipk: Double) {
    var ipk: Double = ipk //Custom getter
        set(value) {
            field = if(value < 0.0) 0.0 else if(value > 4.0) 4.0 else value
        }
}

fun main() {
    val mhs = Mahasiswa(5.5)
    println(mhs.ipk)

    mhs.ipk = 10.0
    println(mhs.ipk
    )

    mhs.ipk = -20.0
    println(mhs.ipk)
}