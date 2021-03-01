package Interface

import Interface.ClassInterface.Animal
import Interface.ClassInterface.Car
import Interface.ClassInterface.Human
import Interface.ClassInterface.Plant

fun main() {

    val human = Human("Willy")
    human.sayHello("Rahma")

    //multiple inheritance
    val animal = Animal ("Kuri")
    animal.sayHello("Rahma")
    animal.touch()

    //inheritance antar interace
    val plant = Plant("Rahma")
    plant.sayHello("Willy")
    plant.touch()
    plant.save()

    //konflik inheritance
    val car = Car("Willy")
    car.sayHello("Rahma")
    car.move()

}