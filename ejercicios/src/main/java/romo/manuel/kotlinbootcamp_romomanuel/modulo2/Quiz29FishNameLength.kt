package romo.manuel.kotlinbootcamp_romomanuel.modulo2

/**
 * Autor: Manuel Romo López
 * ID: 00000253080
 */

fun main(args : Array<String>){

    var fishName = "trout"

    when(fishName.length){
        0 -> println("There must be fish.")
        in 3..12 -> println("Good fish name")
        else -> println("OK fish name")
    }

}
