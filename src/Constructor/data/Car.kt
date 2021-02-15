package Constructor.data

/*
    - class dapat ditambahkan parameter/constructor
    - dan nilai constructor dapat ditentukan secara default atau tanpa nilai
    - jika class ditambahkan parameter/constructor maka jika diakses menjadi object wajib untuk memasukan paramternya (jika parameternya belum ditentukan nilai defaultnya)
 */

class Car(paramBrand: String, paramYear: Int = 2020) {

    var brand : String = paramBrand
    var year: Int = paramYear
}