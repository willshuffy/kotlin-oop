package Dataclass

import Dataclass.Class.Hero

fun main() {

    val hero = Hero("Batman", 30, "punch")

    println(hero)

    //==================================================================================================================
    /*
        copy data class
            - data class memiliki function copy yang bisa digunakan untuk menduplikasi object
            - bahkan metode copy tsb bisa sekaligus mengubah propertiesnya
     */

    val hero2 = hero.copy()
    println(hero2)

    val hero3 = hero.copy(name = "Robin")
    println(hero3)

    val hero4 = hero.copy(name = "Superman", action = "Flight")
    println(hero4)
}