package SealedClass.Class

/*
    Sealed Class :
        - merupakan jenis class yg didesain untuk inheritance dengan menggunakan keyword sealed di depan class nya
        - sealed class tidak bisa diinstansiasi menjadi object, dan secara standar sealed class merupakan abstract class
        - sealed class sgt cocok digunakan sebagai class parent

        - sealed class sangat berguna saat kita menggunakan when expression
        - dengan menggunakan sealed class, kita bisa membatasi hanya class turunannya yg perlu dicheck
 */

sealed class Operation(val name: String)
class plus: Operation("Plus")
class minus: Operation("Minus")