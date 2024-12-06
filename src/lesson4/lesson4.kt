package lesson4

fun main() {
    val userAge = readln().toInt()
    val resultText = if (userAge >= MAJORITY_OF_AGE){
        "Show special content"
    } else if (userAge == 16 || userAge ==17) {
       "Show limited content"
    }
    else {
        "Back to main page"
    }
    //println(resultText)
    val consoleNumber = when(userAge) {
        10 -> "Your number is 10"
        42 -> "Your number is 42"
        20 -> "Your number is 20"
        else -> "Another number"
    }
    println(consoleNumber)
}

const val MAJORITY_OF_AGE = 18