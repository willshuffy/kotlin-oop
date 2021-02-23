package AbstractClass

import AbstractClass.Class.Street
import AbstractClass.Class.StreetA
import AbstractClass.Class.StreetB

fun main() {


    val street1 = StreetA("Jl.Radjiman") //pada object ini, StreetA yang dijadikan object,jika langsung class abstract Street yang dijadikan object, maka akan error
//    val street1 = Street("Jl.Radjiman")
    val street2 = StreetB("Jl.Mampang")

    println(street1.name)
    println(street2.name)
}