package InitializerBlock.app

import InitializerBlock.data.Mobil


fun main() {

    val avanza = Mobil("Toyota")

    val kodok = Mobil("Volkswagen")
    kodok.year = 1970


    val xenia = Mobil("Daihatsu", 2010)

    println(avanza.brand)
    println(avanza.year)

    println(kodok.brand)
    println(kodok.year)

    println(xenia.brand)
    println(xenia.year)

}