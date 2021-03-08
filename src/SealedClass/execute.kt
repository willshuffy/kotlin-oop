package SealedClass

import SealedClass.Class.Operation
import SealedClass.Class.minus
import SealedClass.Class.plus

fun operation(value1: Int, value2: Int, operation: Operation): Int{
     return when(operation){ // when expression akan membantu pengecekan jumlah tipe datanya class turunannya
        is plus -> value1 + value2
        is minus -> value1 - value2
    }
}

fun main() {
    println(operation(10, 10, plus()))
    println(operation(10,5, minus()))
}