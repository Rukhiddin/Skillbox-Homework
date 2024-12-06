package lesson4

fun main() {
    val userAge = readln().toInt()
    if (userAge >= MAJORITY_OF_AGE){
        println("Show special content")
    }
    if (userAge < MAJORITY_OF_AGE){
        println("Back to main page")
    }
}

const val MAJORITY_OF_AGE = 18