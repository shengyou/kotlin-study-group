package chapter7

fun main() {
    "shandy, Dragon's Breath, 5.91"
        .split(",")
        .map { it.reversed().trim() }
        .forEach {
            println(">>>${it}<<<")
        }
}