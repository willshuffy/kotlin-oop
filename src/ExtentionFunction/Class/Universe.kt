package ExtentionFunction.Class

/*
    Extension Function :
        - pada saat membuat extention function, kita tidak memodifikasi calss aslinya
        - extension function hanyalah sebuah function bantuan, yang artinya kita tidak bisa mengakses data private atau
          protected dari class tersebut
 */

class Universe(val name: String, val orbit: Int)

fun Universe.report(name: String) {
    println("Planet $name, berada di galaksi ${this.name}, dan sudah ${this.orbit} kali orbit")
}

//contoh error
//
//
//class Hero(val heroName: String, private val action: String)
//
//    fun Hero.sayHello(name: String){
//        println("Hello $name, lihat ${this.heroName} dia ${this.action}")
//    }
//


//======================================================================================================================

/*
    Extension properties :
        - kita juga bisa membuat extension untuk properties di kotlin
        - untuk membuat extension di properties, kita bisa membuat properties dengan getter dan setter (jadi tidak hanya
          menggunakan propertiesnya saja)

 */

val Universe.upperPlanet: String
    get() = this.name.toUpperCase()