package chapter7

const val TAVERN_NAME = "Taernyl's Folly"

fun main() {
    placeOrder()
}

private fun placeOrder() {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
//    val tavernMaster = TAVERN_NAME.substring(0, indexOfApostrophe)
    println("Madrigal speaks with $tavernMaster about their order.")
}
