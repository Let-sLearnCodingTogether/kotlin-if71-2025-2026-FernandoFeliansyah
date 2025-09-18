fun main() {
    val firstUser : Triple<String, Byte, Boolean> = Triple("User 1", 20, false)

    //destructuring
    val (username, age, condition) = firstUser

    println(username)
    println(age)
    println(condition)
}