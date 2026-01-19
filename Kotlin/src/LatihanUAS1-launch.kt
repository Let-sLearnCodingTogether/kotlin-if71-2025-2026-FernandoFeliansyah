import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Mulai")
    launch {
        downloading()
    }
    launch {
        downloading()
    }
    println("Sedang download")
}

suspend fun downloading() {
    println("Download Selesai")
    delay(3_000)
}