package nextOOP

interface Electronic {
    fun turnOn()
    fun turnOff()
    fun cleanDrive() = println("Membersihkan debu dari perangkat $brand")
    val brand: String
}

class Fan: Electronic {
    override fun turnOn() {
        println("Kipas angin merek $brand berputar")
    }

    override fun turnOff() {
        println("Kipas angin merek $brand berhenti")
    }

    override val brand: String = "Cosmos"
}

class SmartLight: Electronic {
    override fun turnOn() {
        println("Kipas angin merek $brand berputar")
    }

    override fun turnOff() {
        println("Kipas angin merek $brand berhenti")
    }

    override val brand: String = "Cosmos"
}

fun main() {
    val kipas1 = Fan()
    val kipas2 = SmartLight()

    kipas2.turnOff()
    kipas2.turnOn()
    kipas2.cleanDrive()
}