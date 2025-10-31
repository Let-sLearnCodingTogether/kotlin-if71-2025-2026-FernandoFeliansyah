fun main() {
    fun main() {
        //Mutable
        val buah : MutableMap<String, Int> = mutableMapOf(
            "Jeruk" to 10,
            "Apel" to 3,
        )

        buah["Jeruk"] = 12
//        buah.put("Jeruk", 12)
        println(buah.entries)

        buah.remove("Jeruk")
        buah.putAll(mapOf("Jeruk" to 20, "Apel" to 30))
        println(buah.entries)

        buah.clear()
        println(buah.entries)
    }
}