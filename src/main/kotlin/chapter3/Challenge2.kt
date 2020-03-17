package chapter3

fun main() {
    val name = "Madrigal"
    var healthPoints = (1..100).shuffled().first()
    val isBlessed = listOf(true, false).shuffled().first()
    val isImmortal = false

    // Aura
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20).toInt()
    val auraColor = when(karma) {
        in 0..5 -> "RED"
        in 6..10 -> "ORANGE"
        in 11..15 -> "PURPLE"
        in 16..20 -> "GREEN"
        else -> "UNKNOWN"
    }

    // Player status
    val healthStatus = when(healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has come minor wounds but is healing quite quickly!"
        } else {
            "has come minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }

    // Output
    println("(Aura: ${if (auraVisible) auraColor else "NONE"}) " +
            "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
}
