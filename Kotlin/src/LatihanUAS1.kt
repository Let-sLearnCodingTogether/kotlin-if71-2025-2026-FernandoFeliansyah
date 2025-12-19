import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Mulai")
    download()
    println("Selesai")
}

suspend fun download() {
    println("Download Data")
    delay(3_000)
}