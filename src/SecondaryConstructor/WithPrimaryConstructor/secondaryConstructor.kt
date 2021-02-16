package SecondaryConstructor.WithPrimaryConstructor

fun main() {

    //memanggil primary constructor
    val ayam = Animal("Bertelur", "Ayam", "Herbivora")
    ayam.name = "Ayam Kate"

    //memanggil secondary constructor pertama
    val harimau = Animal("mamalia", "Carnivora")

    //memanggil secondary constructor kedua
    val musang = Animal("Omnivora")

    println()
    println(ayam.species)
    println(ayam.name)
    println(ayam.category)

    println()
    println(harimau.species)
    println(harimau.name)
    println(harimau.category)

    println()
    println(musang.species)
    println(musang.name)
    println(musang.category)
}