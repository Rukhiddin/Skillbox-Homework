package lesson4

fun main() {
    var counter = 5
//    while (counter > 0) {
//        println("Реклама закончится через ${counter--}")
//    Thread.sleep(1000)
//    }
    do {println("Реклама закончится через ${counter--}")
    Thread.sleep(1000)
    } while (counter > 0)
}

