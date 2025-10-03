fun main() {
    //Immmutable
    val animals : Set<String> = setOf("Zebra", "Kucing")
    println(animals)

    println("Size : ${animals.size}")
    println("Is Empty : ${animals.isEmpty()}")
    println("Contains : ${animals.contains("Zebra")}")
    println("Contains All : ${animals.containsAll(listOf("Zebra", "ayam"))}")

    val animalIterator = animals.iterator()
    while (animalIterator.hasNext()) {
        val animal = animalIterator.next()
        println("Animal: ${animalIterator.next()}")
    }
}