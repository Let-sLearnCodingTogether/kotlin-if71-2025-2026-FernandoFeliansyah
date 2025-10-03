fun main() {
    //Immutable
    val buah : Map<String, Int> = mapOf(
        "Jeruk" to 10,
        "Apel" to 3,
    )
    println("Size : ${buah.size}")
    println("Is Empty : ${buah.isEmpty()}")
    println("Contains Key : ${buah.containsKey("Jeruk")}")
    println("Contains Value : ${buah.containsValue(10)}")
    println("Get Key : ${buah.get("Apel")}")
    println("Get or Default ${buah.getOrDefault("Pisang",0)}")
    println(buah.keys)
    println(buah.values)
    println(buah.entries)

    buah.entries.forEach {(key,value) ->
        println("Key : ${key}, Value : $value")
    }
}