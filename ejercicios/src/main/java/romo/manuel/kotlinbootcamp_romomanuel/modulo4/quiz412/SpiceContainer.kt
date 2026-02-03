package romo.manuel.kotlinbootcamp_romomanuel.modulo4.quiz412

import romo.manuel.kotlinbootcamp_romomanuel.modulo4.quiz45.Spice

fun main(args : Array<String>){
    val container1 = SpiceContainer(Spice("curry", "mild"))
    val container2 = SpiceContainer(Spice("cayenne", "medium"))
    val container3 = SpiceContainer(Spice("ginger", "mild"))

    println("Label of container1: ${container1.label}")
    println("Label of container2: ${container2.label}")
    println("Label of container3: ${container3.label}")

}

data class SpiceContainer(val spice: Spice) {
    val label = spice.name

}