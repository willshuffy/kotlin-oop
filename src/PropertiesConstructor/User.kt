package PropertiesConstructor

/*
    Properties Constructor :
                            - menjadikan parameter pada constructor menjadi properties, sehingga bisa langsung diakses tanpa harus dibuat prperties terpisah yg memanggil parameter constructor
                            - hanya dapat dilakukan pada primary constructor, tidak dapat dilakukan di secondary constructor
 */

//parameter langsung dibuat menjadi properties
class User(var username: String, var password: String) {

    //tanpa harus membuat properties di sini
}