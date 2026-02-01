package romo.manuel.kotlinbootcamp_romomanuel.modulo3

/**
 * Autor: Manuel Romo López
 * ID: 00000253080
 */

fun main(args : Array<String>) {

    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("sad", weather = "cloudy", temperature = 15))
    println(whatShouldIDoToday("happy", weather = "rainy"))
    println(whatShouldIDoToday("calm", weather = "windy"))
    println(whatShouldIDoToday("angry", weather = "foggy"))
    println(whatShouldIDoToday("sad", weather = "rainy", temperature = 3))

}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String{

    return when{
        mood == "happy" && weather == "sunny" -> "go for a walk"
        mood == "sad" && weather == "cloudy" && temperature == 15 -> "look outside from your window"
        mood == "happy" && weather == "rainy" -> "go play in the mud"
        mood == "calm" && weather == "windy" && temperature == 24 -> "take a deep breath"
        mood == "angry" && weather == "foggy" -> "stay inside your house and read a book"
        else -> "lay in your bed"
    }
}