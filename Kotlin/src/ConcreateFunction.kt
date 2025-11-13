package nextOOP

interface SpaceVechile {
    fun accelerate()

    fun stop() {
        println("Stop")
    }
}

class LightSpace: SpaceVechile {
    override fun accelerate() {
        println("Accelerate")
    }

    override fun stop() {
        println("Stop overriding")
    }
}

fun main() {
    val lightSpaceOne = LightSpace()

    lightSpaceOne.accelerate()
    lightSpaceOne.stop()
}