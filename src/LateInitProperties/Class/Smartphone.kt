package LateInitProperties.Class

/*
    Late init :
                - Standarnya, properties kotlin wajib diinisialisasi di awal saat deklarasi properties tsb
                - namun di kotlin juga bisa menunda inisialisasi data properties
                - dengan menggunakan keyword lateinit, kita bisa membuat properties tanpa harus langsung mengisi datanya
                - keyword lateinit hanya bisa digunakan di var, tidak bisa digunakan di val
 */

class Smartphone {

    lateinit var brand: String //properties tidak langsung dinisiasikan, krn menggunakan keyword lateinit

    fun initSmartphone(brand : String){
        this.brand = brand
    }
}