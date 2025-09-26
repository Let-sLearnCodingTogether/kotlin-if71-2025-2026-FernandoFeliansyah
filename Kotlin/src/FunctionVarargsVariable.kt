fun printUser(firstName: String, vararg users: String) {
    println(firstName)
    for (user in users) {
        println(user)
    }
}

fun main() {
    printUser("User 1", "Anonymous", "User 2", "User 3")
}