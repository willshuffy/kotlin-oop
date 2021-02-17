package Function

fun main() {

    val hero = JusticeLeague()
    hero.heroOne = "Batman"
    hero.heroTwo = "Robin"
    hero.heroThree = "Nightwing"


    hero.sayHello("Iron man")

    hero.attack()

    val action = hero.unity()
    println(action)
}