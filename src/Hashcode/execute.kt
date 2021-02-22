package Hashcode

import Hashcode.Class.Username

fun main() {


    val username1 = Username("Willy")
    val username2 = Username("Willy")

    println(username1.hashCode())
    println(username2.hashCode())
    println(username1.hashCode() == username2.hashCode())
}