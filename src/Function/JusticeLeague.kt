package Function

class JusticeLeague {

    var heroOne: String = ""
    var heroTwo: String = ""
    var heroThree: String = ""

    /*
        function :
                    - function pada class sama seperti biasa pada function kotlin
                    - dan dapat menjadi function object pada class tersebut
     */

    fun sayHello(name: String){
        println("Hello $name, i am $heroOne")
    }

    fun attack(){
        println("Go attack")
    }

    fun unity(): String{
        return "$heroOne, $heroTwo, $heroThree"
    }

}