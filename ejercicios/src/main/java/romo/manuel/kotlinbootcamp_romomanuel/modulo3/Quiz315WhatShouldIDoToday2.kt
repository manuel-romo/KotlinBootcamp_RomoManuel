package romo.manuel.kotlinbootcamp_romomanuel.modulo3

/**
 * Autor: Manuel Romo López
 * ID: 00000253080
 */

fun main(args : Array<String>) {

    println(whatShouldIDoToday2("happy"))
    println(whatShouldIDoToday2("sad", weather = "cloudy", temperature = 15))
    println(whatShouldIDoToday2("happy", weather = "rainy"))
    println(whatShouldIDoToday2("calm", weather = "windy"))
    println(whatShouldIDoToday2("angry", weather = "foggy"))
    println(whatShouldIDoToday2("sad", weather = "rainy", temperature = 0))
    println(whatShouldIDoToday2("happy", "cloudy", temperature = 38))
    println(whatShouldIDoToday2("calm", "snowy", temperature = 1))
    println(whatShouldIDoToday2("angry", "windy", temperature = 34))
    println(whatShouldIDoToday2(readLine()!!))

}

fun whatShouldIDoToday2(mood: String, weather: String = "sunny", temperature: Int = 24): String{

    return when{
        isHappySunny(mood, weather) -> "go for a walk"
        isSadCloudyTemperature15(mood, weather, temperature) -> "look outside from your window"
        isHappyRainy(mood, weather) -> "go play in the mud"
        isCalmWindyTemperature24(mood, weather, temperature) -> "take a deep breath"
        isAngryFoggy(mood, weather) -> "stay inside your house and read a book"
        isSadRainyTemperature0(mood, weather, temperature) -> "stay home"
        isTemperatureGreaterThan35(temperature) -> "go swimming"
        isSnowyTemperatureLessThan10(weather, temperature) -> "make a snowman"
        else -> "lay in your bed"
    }
}

fun isHappySunny(mood: String, weather: String) = mood == "happy" && weather == "sunny"

fun isSadCloudyTemperature15(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "cloudy" && temperature == 15

fun isHappyRainy(mood: String, weather: String) = mood == "happy" && weather == "rainy"

fun isCalmWindyTemperature24(mood: String, weather: String, temperature: Int) = mood == "calm" && weather == "windy" && temperature == 24

fun isAngryFoggy(mood: String, weather: String) = mood == "angry" && weather == "foggy"

fun isSadRainyTemperature0(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0

fun isTemperatureGreaterThan35(temperature: Int) = temperature > 35

fun isSnowyTemperatureLessThan10(weather: String, temperature: Int) = weather == "snowy" && temperature < 10