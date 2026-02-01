package romo.manuel.kotlinbootcamp_romomanuel.modulo3

/**
 * Autor: Manuel Romo López
 * ID: 00000253080
 */


fun main(array: Array<String>){

    var fortune: String = ""

    for (i in 1..10) {
        fortune = getFortuneCookie()

        println("Your fortune is: $fortune")

        if (fortune.contains("Take it easy")) {
            break
        }
    }

}

fun getFortuneCookie(): String{

    val fortunes: List<String> = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    print("Enter your birthday: ")

    var birthday:Int = readLine()?.toIntOrNull() ?: 1

    println(birthday)
    return fortunes[birthday % fortunes.size]

}