package chapter7

fun main() {

    val phrase = "Ah, delicious Dragon's breath"

    println(
        phrase.replace('A', 'B')
    )

    println(
        phrase.replace("Ah", "Oh")
    )

    println(
        toDragonSpeak(phrase)
    )

    println(phrase)
}

private fun toDragonSpeak(phrase: String): String =
    phrase.replace(Regex("[aeiou]")) {
        when (it.value) {
            "a" -> "4"
            "e" -> "3"
            "i" -> "1"
            "o" -> "0"
            "u" -> "|_|"
            else -> it.value
        }
    }
