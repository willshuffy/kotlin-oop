package VisibilityModifier

import VisibilityModifier.Class.Planets
import VisibilityModifier.Class.SuperPlanet

fun main() {

    val planet = Planets("Mars")
    println(planet.name)
//    planet.orbit() //error, karena function yang dipanggil bersifat private
//    planet.rotation()  //error, karena function yang dipanggil bersifat protected

    val superPlanet = SuperPlanet("Saturnus")
    println(superPlanet.name)
    superPlanet.rotation()
}