package SecondaryConstructor.WithoutPrimaryConstructor

fun main() {

    val address1 = Address("Jalan Willy", "Jakarta")
    val address2 = Address("Jalan Rahma", "Padang", "Indonesia")

    println(address1.street)
    println(address2.city)
}