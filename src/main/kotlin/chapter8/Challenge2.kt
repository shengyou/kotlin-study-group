package chapter8

import kotlin.math.roundToInt

fun main() {
    var playerGold = 10
    var playerSilver = 10

    val (type, name, price) = "shandy, Dragon's Breath, 5.91".split(", ")

    try {
        performPurchase(price.toDouble())
        performPurchase(price.toDouble())
    } catch (e: PurseNotEnoughException) {
        println(e)
    }


}

private fun performPurchase(price: Double) {
    displayBalance()

    val totalPurse = playerGold + (playerSilver / 100.0)
    println("Total purse: $totalPurse")
    println("Purchasing item for $price")

    if (totalPurse < price) {
        throw PurseNotEnoughException()
    }

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
