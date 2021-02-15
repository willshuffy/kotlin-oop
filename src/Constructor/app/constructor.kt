package Constructor.app

import Constructor.data.Car

fun main() {

    // contoh akses class constructor dengan salah satun nilai parameter nya telah ditentukan secara default
    val avanza = Car("Toyota")

    //contoh mengubah salah astu nilai constructor dengan properties
    val kodok = Car("Volkswagen")
    kodok.year = 1970           //-> properties

    //contoh mengubah salah astu nilai constructor langsung (ini contoh mengubah nilai yang lebih simple)
    val xenia = Car("Daihatsu", 2010)

    println(avanza.brand)
    println(avanza.year)

    println(kodok.brand)
    println(kodok.year)

    println(xenia.brand)
    println(xenia.year)

}