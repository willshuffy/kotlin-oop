package VisibilityModifier.Class

/*
* Note :
* Public    = Jika class,interface,properties,function bersifat Public maka mereka dapat di akses dari mana saja.
* Private   = Jika class, interface, properties, function bersifat Private maka mereka hanya dapat di akses
*             di tempat pendeklarasiiannya.
* Protected = Jika class, interface, properties, function bersifat Protected maka mereka bisa di akses
*             di tempat pendeklarasiannya dan juga di child atau turunannya.
* Internal  = Jika class, interface, properties, function bersifat Internal maka mereka bisa di akses
*             selama masih dalam 1 project aplikasi. */


open class Planets(val name : String) {

    //contoh function private
    private fun orbit(){
        println("Orbit")
    }

    //contoh function protected
    open protected fun rotation(){
        println("rotation")
    }
}

class SuperPlanet(name: String): Planets(name){

    //contoh override function rotation dari class planet dan dijadikan public
    override public fun rotation() {
        super.rotation()
    }
}