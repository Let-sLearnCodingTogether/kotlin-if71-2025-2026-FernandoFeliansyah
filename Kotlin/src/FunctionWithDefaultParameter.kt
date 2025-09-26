fun sayHello1(firstName : String, lastName : String = "Tanpa Lastname") {
    println("Hello, $firstName $lastName")
}

fun main() {
    sayHello1("Budi", "123")
    sayHello1("Dodo")
}