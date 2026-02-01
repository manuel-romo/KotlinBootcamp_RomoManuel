package romo.manuel.kotlinbootcamp_romomanuel.modulo3

/**
 * Autor: Manuel Romo López
 * ID: 00000253080
 */

fun main(args: Array<String>) {

    var fortune: String = ""
    var i = 1
    while(i <= 10 && !fortune.contains("Take it easy")){
        fortune = getFortuneCookie3(getBirthday3())
        println("\nYour fortune is: $fortune")
        i++
    }

    // La instrucción "break" no se puede colocar dentro de repeat(), porque no es un bucle tradicional como un "while" o un "loop", sino una función que
    // recibe como argumento el bloque de código a repetir.
}

fun getBirthday3(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortuneCookie3(birthday: Int): String{

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