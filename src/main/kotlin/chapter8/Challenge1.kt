package chapter8

var barrel = 5.0 // gallon

fun main() {
    val perOrderPint = 1
    for (i in 1..12) {
        barrel -= (perOrderPint * 0.125)
    }

    println(barrel)
    println(5 - (12 * 0.125))
}
