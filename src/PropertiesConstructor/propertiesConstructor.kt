package PropertiesConstructor

fun main() {

    val user1 = User("Willy", "secret")
    val user2 = User("Batman", "secret123")

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
}