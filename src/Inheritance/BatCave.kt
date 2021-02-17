package Inheritance

/*
    Inheritance :
                    - pewarisan class pada class lain
                    - seluruh isi yang ada pada parent class akan diwarisi semua kepada child nya
                    - dengan inheritance, maka tidak perlu lagi menduplicate function" yang ada di parent
                    - setiap inheritance hanya memiliki 1 parent dan bisa memiliki banyak child
                    - pada inheritance untuk menjadikan class sebagai parent, maka diberi keyword open pada awal class
 */

//parent
open class BatCave(val name: String) {

    //function ini telah diwarisi kepada class child
    fun sayReport(name: String){
        println("Hello $name, i am ${this.name}")
    }
}

//child class mewarisi class batcave
class Robin(name: String) : BatCave(name)

//child class mewarisi class batcave
class Nightwing(name: String) : BatCave(name)