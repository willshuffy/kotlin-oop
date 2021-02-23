package AbstractPropertiesAndFunction.Class

/*
    Abstract properties and function :
                                        - pada sebuah parent class abstract, dapat dibuat properties abstract dan function abstract pada class tsb
                                        - namun jika pada class yang bukan bersifat abstract, maka tidak dapat dibuat properties abstract dan function abstract pada class tsb
                                        - properties dan function yang bersifat abstract, artinya wajib dibuat ulang pada class child nya
 */

abstract class Planets {

    /*
        contoh properties abstract :
                                    - properties yg bersifat abstract tidak dapat menginisiasikan valuenya(seperti pada coment), dan dapat menjadi error
                                    - inisiasi valuenya dpt dilakukan pada overide properties di class childnya
     */
//    abstract val name: String = "blabala"
    abstract val name: String



    /*
        contoh function abstract :
                                    - function yg bersifat abstract tidak dapat menginisiasikan body functionnya(seperti pada coment), dan dapat menjadi error
                                    - inisiasi body function nya dpt dilakukan pada overide function di class childnya
     */
//    abstract fun orbit(){
//
//    }
    abstract fun orbit()
}

class Merkurius: Planets(){

    //contoh properties yang mengoveride class abstract
    override val name: String = "Merkurius"

    //contoh function yang mengoveride class abstract
    override fun orbit() {
        println("Merkurius orbit 200 tahun")
    }

}

class Pluto: Planets(){
    override val name: String = "Pluto"

    override fun orbit() {
        println("Pluto orbit 500 tahun")
    }
}