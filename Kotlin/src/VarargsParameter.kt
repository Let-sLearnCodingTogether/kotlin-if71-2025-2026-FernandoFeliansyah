fun varargs (data: Array<String>) {
    for (name in data) {
        println(name)
    }
}

fun main() {
    varargs(arrayOf("user1", "user2"))
}