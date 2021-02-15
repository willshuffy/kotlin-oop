package InitializerBlock.data


class Mobil(paramBrand: String, paramYear: Int = 2020) {

    /*
        contoh initializer block :
            - block code akan dieksekusi jika constructor dipanggil
            - kita dapat masukan kode program apapun di dalamnya
     */
    init {
        println("mobil $paramBrand dibuat")
    }

    var brand : String = paramBrand
    var year: Int = paramYear
}