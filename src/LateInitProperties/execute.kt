package LateInitProperties

import LateInitProperties.Class.Smartphone

fun main() {

    val hp = Smartphone()
    hp.initSmartphone("Xiaomi")

    println(hp.brand)
}