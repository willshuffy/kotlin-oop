package Dataclass.Class

/*
    Data Class :
        - jika menambah keyword data pada awal class, maka object primary constructor nya bisa otomatis membuatkan
          function toString, equals, hashcode nya secara backgrounnya
        - syaratnya semua atribute propertiesnya dimasukan ke dalam primary constructor
        - data class biasanya digunakan untuk merepresenstasi data dari data base, tabel dll
 */

data class Hero (
        val name: String,
        val age: Int,
        val action: String
)