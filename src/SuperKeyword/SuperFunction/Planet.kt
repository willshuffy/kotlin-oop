package SuperKeyword.SuperFunction

/*
    Super properties:
                        - untuk mengakses / memanggil kembali function milik class parent yang sudah dibuat ulang (overide) oleh class child
                        - dan melakukannya dengan menggunakan keyword super
*/
open class Planet {

    open fun Orbit(){
     println("This is orbit Planets")
    }
}

class Saturnus: Planet(){

    override fun Orbit() {
        println("This is orbit Saturnus")
        super.Orbit()  //memanggil function orbit class planet
    }
}