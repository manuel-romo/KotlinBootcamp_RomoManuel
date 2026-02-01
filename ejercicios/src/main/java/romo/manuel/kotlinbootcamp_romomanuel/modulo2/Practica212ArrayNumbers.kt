package romo.manuel.kotlinbootcamp_romomanuel.modulo2

/**
 * Autor: Manuel Romo López
 * ID: 00000253080
 */

fun main(args : Array<String>){

    val numbers : Array<Int> = arrayOf(11, 12, 13, 14, 15)
    val listStringNumbers : MutableList<String> = mutableListOf()
    for (number in numbers) listStringNumbers.add(number.toString())
    println(listStringNumbers)

    // Números divisibles por 7
    val list : MutableList<Int> = mutableListOf()
    for (i in 0..100 step 7) list.add(i)
    println(list)


}
