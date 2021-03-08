package InnerClass

/*
    Inner class :
        - pada kotlin kita bisa membuat class (inner) di dalam class (outer)
        - walaupun class inner tersebut berada di dalam class outer, class inner tidak bisa mengakses data yg ada di dalam
          class outer
        - agar class inner bisa mengakses data yang ada di dalam class outer, kita bisa menggunakan keyword inner
 */

class HeroSuper(val name: String) {

    inner class Villain(val name: String){

        fun hi(){
            println("I am $name, my enemy is ${this@HeroSuper.name}") // mengakses data class outer menggunakan keyword @
        }
    }
}