package chapter7

fun main() {

    val data = "shandy, Dragon's Breath, 5.91"
        .split(", ")

    println(data[0])
    println(data[1])
    println(data[2])

    val (type, name, price) = "shandy, Dragon's Breath, 5.91"
        .split(", ")

    println(type)
    println(name)
    println(price)

}