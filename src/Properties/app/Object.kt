package Properties.app

import Properties.data.Person

fun main() {


    /*
        - untuk mengakses properties/fielad pada class, dengan menggunakan titik setelah nama object dan diikuti nama propertiesnya
     */

    //contoh obect yang dibuat
    val biodata = Person()

    biodata.firstName = "Willy"
    biodata.middleName = "Rahma"
    biodata.lastName = "Saputra"

    val biodata2 = Person()

    biodata2.firstName = "Rahma"

    println(biodata.firstName)
    println(biodata2.firstName)

}