package EnumClass.Class


/*
    Enum Class :
        - merupakan representasi dari class yang sudah tetap nilainya
        - biasanya enum class digunakan untuk jenis data yang sudah baku, seperti jenis kelamin, arah mata angin dan
          sejenisnya
        - untuk membuat enum class, kita bisa menggunakan kata kunci enum sebelum delarasi class nya
        - kita tidak bisa membuat object dari class enum, namun kita bisa mendeklarasikan langsung object yang tersedia
          untuk enum class tersebut (jadi langsung deklarasikan data nya apa aja)
 */

enum class Gender {

    PRIA,
    WANITA

}

/*
    Properties dan function di enum class
        - enum class adalah class seperti biasa pada umumnya
        - enum class bisa memiliki properties ataupun function
        - namun jika propertiesnya di set menggunakan constructors, maka saat pembuatan object enum wajib diisi, dan jika
          terdapat abstract function, wajib di override pada saat pembuatan object enum
 */


enum class Cuaca(val description: String){

    HUJAN("Musim Hujan"),
    PANAS("Musim Panas");

    fun showDescription(): Unit {

        println(description)
    }
}