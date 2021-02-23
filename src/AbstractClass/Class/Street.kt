package AbstractClass.Class

/*
    Abstract Class :
                    - jika sebuah class dijadikan abstract class, maka class tersebut tidak bisa dibuat sebagai object, hanya bisa diturunkan
                    - jadi jika kita buat suatu function, maka kita hanya dapat menjadikan class lain yang mengextend class abstract tsb sebagai object pada function yg kita buat
 */

//class abstract
abstract class Street(val name: String)

//class lain yg mengextend class abstact
class StreetA(name: String): Street(name)

//class lain yg mengextend class abstact
class StreetB(name: String): Street(name)