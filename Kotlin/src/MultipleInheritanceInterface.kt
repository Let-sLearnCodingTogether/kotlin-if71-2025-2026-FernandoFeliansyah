package nextOOP

interface Wheeled {
    val numberOfWheels: Int
}

interface Vehicle {
    fun drive()
}

class SepedaRodaTiga(override val numberOfWheels: Int = 3): Wheeled, Vehicle {
    override fun drive() {
        println("Not yet implemented")
    }
}

fun main() {
    val sepedaRodaTiga1 = SepedaRodaTiga(numberOfWheels = 3)
}