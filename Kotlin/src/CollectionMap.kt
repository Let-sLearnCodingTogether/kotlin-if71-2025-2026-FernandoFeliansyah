fun main() {
    //Immutable
    val buah : Map<String, Int> = mapOf(
        "Jeruk" to 10,
        "Apel" to 3,
    )
    println(buah["Jeruk"])

    //Mutable
    val buah2 : MutableMap<String, Int> = mutableMapOf(
        "Jeruk" to 10,
        "Apel" to 3,
    )
    println(buah2["Jeru"])
    println(buah2.remove("Jeruk"))
    println(buah2)
}