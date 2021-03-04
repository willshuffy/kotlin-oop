package ExtentionFunction

import ExtentionFunction.Class.Universe
import ExtentionFunction.Class.report
import ExtentionFunction.Class.upperPlanet

fun main() {


    val universe = Universe("Andromeda", 2000)
   universe.report("pluto")

    println(universe.upperPlanet)
}