package PropertiesOverriding

/*
    properties overriding :
                            - membuat ulang prperties yang ada pada parent class ke child class
                            - kurang lebih sama seperti function overriding
 */

open class Home {

    //properties pada parent class
    open val volume: Int = 40

}

open class Windows: Home() {
    override val volume: Int = 20
}

class Doors: Windows(){

    override val volume: Int = 10
}