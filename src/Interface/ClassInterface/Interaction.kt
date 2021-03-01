package Interface.ClassInterface

/*
    Interface :
                - Interface mirip dengan class
                - namun perbedaannya adalah interface tidak bisa langsung dibuat sebagai object (mirip abstract class)
                - interface hanya bisa diturunkan, dan biasanya interface digunakan sebagai kontrak untuk class" turunannya
                - secara default, semua properties dan function di interface adalah abstract (tanpa harus menggunakan keyword abstract)
 */

interface Interaction { //tidak memiliki constructor

    //properties tidak bisa langsung diinisiasikan datanya, dan wajib dioverride pada class child nya
    val name: String

    //function bisa langsung dibuat body nya (concrete function), bisa juga tidak, seperti contoh berikut
    fun sayHello(name: String)
}

//class human (child) mewarisi class interface interaction
class Human (override val name: String): Interaction{

    //jika function pada interface tidak dibuat bodynya, maka wajib dioverride pada class childnya, seperti berikut
    override fun sayHello(name: String) {
        println("Hello $name, nama saya ${this.name}")
    }
}

//=======================================================================

/*
    Multiple inheritance dengan interface
        - inheritance di class hanya boleh memiliki satu class parent
        - berbeda pada interface, sebuah class child bisa memiliki banyak interface parent
 */

//contoh Multiple inheritance
interface Touch{

    //concrete function
    fun touch(){
        println("Touch !")
    }
}

//class animal memiliki lebih dari satu interface parent (interacton dan touch)
class Animal(override val name: String): Interaction, Touch{
    override fun sayHello(name: String) {
        println("Hello $name, this is ${this.name} my bear")
    }
}

//================================================================================================

/*
    Inheritance antar interface
        - interface dapat melakukan inheritance juga
        - namun interface hanya bisa melakukan inheritance dengan interace lain, tidak dapat melakukan inheritance dengan class
        - interface dapat melakukan inheritance lebih dari satu interface
 */

interface Save : Interaction, Touch{
    fun save(){
        println("Save Me!")
    }
}

//class plant cukup inheritance interace save saja, krn interface save telah inheritance interface interaction dan touch
class  Plant (override val name: String): Save{

    override fun sayHello(name: String) {
        println("Hello $name, i'am ${this.name}")
    }
}

//================================================================================================

/*
    Konlik same name interface
        - jika terdapat lebih dari satu interface yang memiliki function yang sama, maka wajib mengoveride functionnya pada class child nya
        - untuk membedakan pemanggilan function antar interfacenya dapat menggunakan super<nama interface>
 */

interface MoveA {
    fun move(){
        println("Move A")
    }
}

interface MoveB{
    fun move(){
        println("Move B")
    }
}

class Car(override val name: String): Save,MoveA, MoveB{

    override fun sayHello(name: String) {
        println("Hello $name, this is ${this.name}'s Car")
    }

    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
        println("Batmobile")
    }


}