package ToString

import ToString.Class.Barang

fun main() {

    val item = Barang()

    println(item)

    item.name = "kado"
    println(item.name.toString())

    item.kodeNo = "reg123"

    println(item.kodeNo.toString())
    println(item.kodeNo.toString() == item.kodeNo.toString())

    val item2 = Barang()
    println(item2)

    item2.name = "kado123"
    item2.kodeNo = "register123"

    println(item.name.toString() == item2.kodeNo.toString())
    println(item.toString() == item2.toString())
}