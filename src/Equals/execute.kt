package Equals

fun main() {

    val school1 = School("UI")
    val school2 = School("UNJ")

    println(school1 == school2)
    println(school1 == school1)
    println(school2 == school2)
}