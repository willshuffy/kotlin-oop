package EnumClass

import EnumClass.Class.Cuaca
import EnumClass.Class.Gender

fun main() {

    //langsung akses datanya
    val man = Gender.PRIA
    val woman = Gender.WANITA

    //jika kita ingin memangil semua kombinasi data nya
    val allGenders : Array<Gender> = Gender.values()

    //jika ingin mengkonversi dari string menjadi object gendernya
    val manFromString = Gender.valueOf("PRIA")
    val womanFromString = Gender.valueOf("WANITA") //data string tsb mesti sama penulisannya dgn data objectnya

    println(man)
    println(woman)
    println(allGenders.toList())


    val rain = Cuaca.HUJAN
    val sun = Cuaca.PANAS

    //memanggil function pada enum class
    rain.showDescription()
    sun.showDescription()
}