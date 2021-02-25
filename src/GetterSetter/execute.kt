package GetterSetter

import GetterSetter.Class.Book
import GetterSetter.Class.HollyBook

fun main() {


    val book = Book("Novel drama")

    /*
        - pemaggilan hanya mention propertiesnya (konten) saja, tanpa harus mention getter dan setter nya juga
        - karena dgn hanya mention propertiesnya saja, sudah include memanggil function getter setter nya
     */
    println(book.konten)

    // contoh memanggil function setter
    book.konten= "" //contoh berikut memanggil function setter namun tidak mengubah isi valuenya, sesuai validasi yg dibuat pada body setter di class Book

    // contoh memanggil function setter mengubah value
    println()
    book.konten = "Buku Ensiklopedia"
    println(book.konten)

    val hollyBook = HollyBook("Buku Agama")

    println(hollyBook.konten) //memanggil properties pada constructor
    println(hollyBook.hollyKonten) //memanggil properties pada getter (menjadikan uppercase)

}