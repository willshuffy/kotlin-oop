package InnerClass

fun main() {

    /*
        - untuk memanggil class inner nya tidak bisa langsung memanggilnya dengan 1 object saja
          ( val hero = HeroSuper.Villain() )
        - namun mesti dibuat terlebih dahulu object untuk class outernya dan memanggil object class outer nya
          pada object class innernya, seperti contoh berikut
     */

    val hero1 = HeroSuper("Batman")
    val villain1 = hero1.Villain("Joker")
    val villain2 = hero1.Villain("Pinguin")

    val hero2 = HeroSuper("Superman")
    val villain3 = hero2.Villain("Lex Luthor")
    val villain4 = hero2.Villain("General Zord")

    villain1.hi()
    villain2.hi()
    villain3.hi()
    villain4.hi()
}