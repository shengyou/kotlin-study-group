package chapter7

fun main() {

    val (type, name, price) = "exlixir, Shirley's Temple, 4.12"
        .split(", ")

    val phrase = if (name == "Dragon's breath") {
        "Madrigal exclaims ${toDragonSpeak("Ah, delicious $name!")}"
    } else {
        "Madrigal says: Thanks for the $name"
    }

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
