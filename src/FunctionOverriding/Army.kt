package FunctionOverriding

/*
    Function Overriding :
                            - kemampuan untuk membuat ulang function yang sudah ada di class parent
                            - secara default, function di class parent adalah final, tidak bisa dibuat ulang di class child
                            - agar function bisa dibuat ulang di class child, kita harus menggunakan keyword open
 */

open class Army(val name: String) {

    //function pada parent class
    open fun sayReprot(name: String){
        println("Hello $name, I am ${this.name}")
    }
}

class Mayor(name: String): Army(name){

    //function overriding pada class child
    override fun sayReprot(name: String){
        println("Hello $name, I am Mayor ${this.name}")
    }

    /*
        ketentuan :
                    - function overriding diawali dengan keyword overide
                    - penulisan function harus sama dengan function pada class parent (penamaan, parameter, return value) semua harus sama
                    - namun isi dari function nya boleh berbeda, bebas untuk di custom
     */
}

open class General(name: String): Army(name){

    //final overriding function pada class child
    final override fun sayReprot(name: String){
        println("Hello $name, I am General ${this.name}")
    }
}

//contoh class child dari class General
class Sersan(name: String): General(name){

    //ERROR
//    override fun sayReprot(name: String) {
//        println("Hello $name, I am Sersan ${this.name}")
//    }

    /*
        Contoh Final Override Function :
                                            - saat membuat function overriding di class child, secara default class tsb menjadi bersfat open,
                                              artinya dpt dioverride pada class chld di bawahnya
                                            - jika tdak ingin dioverride oleh class child di bawahnya lagi, kta harus gunakan keyword final
                                            - pada class ini tidak dapat meng overide fun sreport pada class general
     */

}