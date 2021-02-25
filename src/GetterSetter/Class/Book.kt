package GetterSetter.Class

/*
    Getter Setter :
                    - Getter adalah function untuk mengambil data properties
                    - Setter adalah function untuk mengubah data properties
                    - pada kotlin tidak perlu manual untuk membuat function getter setter, krn sudah di fasilitasi sehingga lebih mudah
 */

//contoh dengan getter setter
class Book (konten: String) {

    /*
        - jika properties menggunakan var, maka kita dapat menggunakan getter dan setter
        - jika properties menggunakan val, maka kita hanya dapat menggunakan getter saja
        - setiap getter dan setter dapat menggunakan body dan menambahkan syntax pemrograman di dalam nya jika mau, atau bisa juga hanya inisiasi returnnya saja
        - pada contoh berikut kita akan menggunakan body
     */

    var konten: String = konten
    get() {

        println("call getter function")
        return field //field ini jika diklik akan merefer pada atribute konten milik properties
    }
    set(value) {

        println("call setter function")

        //pada body ini akan ditambahkan program validasi If
        if (value.isNotBlank()){
            field=value //jika valuenya tidak kosong, maka fieldnya diset oleh value, namun jika sebaliknya, maka fieldnya tidak akan diset value
        }
    }
}


//contoh dengan getter saja
class HollyBook(val konten: String){

    val hollyKonten: String // jika menggunakan val dan function getter saja, maka properties tidak dapat diinisiasikan (error)
    get() = konten.toUpperCase()
}