package chapter8

import kotlin.math.roundToInt

const val TAVERN_NAME = "Taernyl's Folly"

var playerGold = 10
var playerSilver = 10

fun main() {
    val (type, name, price) = "shandy, Dragon's Breath, 5.91".split(", ")

    performPurchase(price.toDouble())
}

private fun performPurchase(price: Double) {
    displayBalance()

    val totalPurse = playerGold + (playerSilver / 100.0)
    println("Total purse: $totalPurse")
    println("Purchasing item for $price")

    val remainingBalence = totalPurse - price
    println("Remaining balance: ${"%.2f".format(remainingBalence)}")
    // println("Remaining balance: ${remainingBalence.toFloat()}")

    val remainingGold = remainingBalence.toInt()
    val remainingSilver = (remainingBalence % 1 * 100).roundToInt()
    playerGold = remainingGold
    playerSilver = remainingSilver
    displayBalance()
}

private fun displayBalance() {
    println("Player's purse balance: Gold: $playerGold , Silver: $playerSilver")
}
