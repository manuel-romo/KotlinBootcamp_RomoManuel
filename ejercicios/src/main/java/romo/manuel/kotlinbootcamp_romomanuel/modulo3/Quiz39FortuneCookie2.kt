package romo.manuel.kotlinbootcamp_romomanuel.modulo3

/**
 * Autor: Manuel Romo López
 * ID: 00000253080
 */

fun main(args: Array<String>) {
    var fortune: String

    for (i in 1..10) {
        fortune = getFortuneCookie2(getBirthday2())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }

}

fun getBirthday2(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortuneCookie2(birthday: Int): String{


    val fortunes: List<String> = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    return when(birthday) {
        29, 31 -> fortunes[0]
        in 1..7 -> fortunes[1]
        else -> fortunes[birthday % fortunes.size]
    }
}