package ThisKeyword

class Mahasiswa(var name: String,  var lastName: String) {

    /*
        this keyword :
                        - untuk memanggil nama properties pada class yang tertutup oleh parameter
                          function yang memiliki penamaan sama
                        - this hanya bisa digunakan di dalam class itu sendiri
     */

    fun intro(name: String){

        //jika tidak menggunakan this, maka name yang dipanggil hanya akan merefer pada parameter function ini saja
        println("Hai $name, i am ${this.name} $lastName")
    }
}