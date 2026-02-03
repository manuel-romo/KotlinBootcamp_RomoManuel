package romo.manuel.kotlinbootcamp_romomanuel.modulo4.quiz45

/**
 * Autor: Manuel Romo López
 * ID: 00000253080
 */

fun main(args : Array<String>){

    val listSpicies = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "no heat"),
        Spice("turmeric", "no heat"),
        Spice("ginger", "mild"),
        Spice("paprika", "mild"),
        Spice("jalapeño", "medium"),
        Spice("cayenne", "spicy"),
        Spice("tabasco", "spicy"),
        Spice("habanero", "very spicy"),
        Spice("ghost pepper", "extreme")

    )

    val listSpiciesSpicyOrLessThanSpicy = listSpicies.filter { it.heat <= 10 }

    println("List of spcies spicy or less than spicy:")
    for(spice in listSpiciesSpicyOrLessThanSpicy){
        println("Name: ${spice.name}, spiciness: ${spice.spiciness}, heat: ${spice.heat}")
    }

}