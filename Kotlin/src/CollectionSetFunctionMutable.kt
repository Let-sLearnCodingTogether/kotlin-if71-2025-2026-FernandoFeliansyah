fun main() {
    //Mutable
    val animals : MutableSet<String> = mutableSetOf()
    animals.add("Ayam")
    animals.add("Ikan")
    println(animals)

    animals.remove("Ayam")
    println(animals)

    animals.addAll(listOf("Sapi", "Kerbau", "Kucing", "Ayam", "Ayam"))
    println(animals)
    animals.retainAll(listOf("Sapi", "Kerbau", "Kucing"))
    println(animals)
    animals.removeAll(animals)
    println(animals)
    animals.clear()
    println(animals)
}