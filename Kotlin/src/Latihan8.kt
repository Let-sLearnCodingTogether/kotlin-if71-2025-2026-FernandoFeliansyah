fun hitungPanjangNama (name : String?): Int {
    if(name == null) {
        return 0
    } else {
        return name.length
    }
}

fun main() {
    println(hitungPanjangNama("dodo"))
    println(hitungPanjangNama(null))
}