package romo.manuel.kotlinbootcamp_romomanuel.modulo3

/**
 * Autor: Manuel Romo López
 * ID: 00000253080
 */

fun main(args: Array<String>){

    println(canAddFish(10.0, listOf(3, 3, 3)))
    println(canAddFish(8.0, listOf(2, 2, 2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1, 1, 3), 3))
    println(canAddFish(10.0, listOf(), 7, true))

}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {

    var totalSizeFish = currentFish.sum()

    var maximunSizeAllowed :Double = tankSize

    if(hasDecorations){
        maximunSizeAllowed -= tankSize * 0.2
    }

    return !(totalSizeFish + fishSize > maximunSizeAllowed)

}