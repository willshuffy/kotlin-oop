package SecondaryConstructor.WithPrimaryConstructor

/*
    secondary constructor :
                            - penambahan constructor tambahan selain dari primary constructor(constructor utama yanga terdapat di class)
                            - secondary constructor boleh lebih dari 1, namun memliki jumlah parameter yang berbeda dari primary constructor
                            - di dalam secondary constructor dapat ditambahkan kode program apapun, berbeda dgn primary constructor yang harus ditambahkan init terlebih dahulu
                            - saat membuat secndary constructor kita wajib memanggil primary constructor, jika class memiliki primary constructor
 */

//class menggunakan primary constructor
class Animal(paramSpecies: String, paramName: String?, paramCategory: String) {
    init {
        println("Hewan $paramSpecies jenis $paramCategory")
    } //untuk primary constructor menambahkan kode program harus didalam init

    //secondary constructor pertama
    constructor(paramSpecies: String, paramCategory: String) : this(paramSpecies, null, paramCategory){
        println("Secondary Constructor 1") //bisa langsung menambahkan kode program harus didalam constructor
    }

    //secondary constructor kedua
    constructor(paramCategory: String): this("",paramCategory){
        println("Secondary Constructor 2")
    }

    var species: String = paramSpecies
    var name: String? = paramName
    var category: String = paramCategory

}