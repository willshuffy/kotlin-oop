package SuperKeyword.SuperProperties

/*
    Super properties:
                        - untuk mengakses / memanggil kembali properties milik class parent yang sudah dibuat ulang (overide) oleh class child
                        - dan melakukannya dengan menggunakan keyword super
 */

open class Planets {
    open val radius: Int = 100
}

class Merkurius : Pluto() { //memanggil parent class pluto (bisa juga yg menjad parentnya class planets)
    override val radius: Int = 600
    val parentRadius: Int = super.radius //memanggil properties radius class planet

//        val parentRadius: Int = super.super.radius
    /*
        - jika ingn memanggil properties radius class planet, bisa menggunkan keyword tsb
        - namun mesti dibuat method lagi pada class parent (pluto) untuk mengakses properties radius class parent
     */
}

open class Pluto : Planets() { // parent class pluto adalah class planets
    override val radius: Int = 200
}