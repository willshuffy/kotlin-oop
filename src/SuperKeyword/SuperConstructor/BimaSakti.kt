package SuperKeyword.SuperConstructor

/*
    Super properties:
                        - untuk mengakses / memanggil kembali primary constructor milik class parent di dalam secondary constructor class child
                        - dan melakukannya dengan menggunakan keyword super
*/


//parent class
open class BimaSakti(val name: String, val type: String, val radius: Int) {

    constructor(name: String, type: String): this(name, type, 110)
    constructor(name: String): this(name, "Galaksi")

}

class Uranus : BimaSakti{
    constructor(name: String): super(name, "Big planet")
    constructor(name: String, radius: Int): super(name, "Big Planet", 220)

    /*
        - contoh menggunakan super constructor
        - jika ingin menggunakan super constructor utk mengakses constructor class parent, hanya bisa pada secondary constructornya saja
        - dan classnya harus tidak memiliki primary constructor (jika sebaliknya, maka akan error jika memakai super constructor)
     */
}

class Mars(name: String, radius: Int): BimaSakti(name, "middle planet", radius){
    constructor(name: String): this(name, 100)

    /*
        - contoh tidak menggunakan super constructor
        - jika class memiliki primary constructor, maka tidak bisa mengakses construcor pada parent class dengan menggunakan keywrd super
        - cukup dengan mengextend saja pada primary constructor utk mengakses constructor parent class
     */
}