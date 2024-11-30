package lesson3

fun main() {
   var firstName: String = "Rukhiddin"
 val lastName: String = "Miradkhamov"
 var height: Double = 182.0
 var weight: Float = 80f
 var isChild: Boolean = height < 150 || weight < 40
 var info: String = "Name:\t\t$firstName\nSurname:\t$lastName\nHeiht:\t\t$height\nWeight:\t\t$weight\nis child?\t$isChild"
 println("$info")
 height = 149.0
 weight = 39f
 isChild = height < 150 || weight < 40
 info = "Name:\t\t$firstName\nSurname:\t$lastName\nHeiht:\t\t$height\nWeight:\t\t$weight\nis child?\t$isChild"
 println("$info")








}