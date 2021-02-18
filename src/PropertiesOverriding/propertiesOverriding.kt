package PropertiesOverriding

fun main() {

    val home = Home()
    println(home.volume)

    val windows = Windows()
    println(windows.volume)

    val doors = Doors()
    println(doors.volume)
}