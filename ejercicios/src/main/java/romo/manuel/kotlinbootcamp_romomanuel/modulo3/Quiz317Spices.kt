package romo.manuel.kotlinbootcamp_romomanuel.modulo3

/**
 * Autor: Manuel Romo López
 * ID: 00000253080
 */

fun main(args : Array<String>){
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")

    val sortedSpices = spices.filter{it.contains("curry")}.sortedBy{it.length}
    println(sortedSpices)


    val spicesStartCEndE1 = spices.filter{it[0] == 'c' && it[it.length - 1] == 'e'}
    println(spicesStartCEndE1)

    val spicesStartCEndE2 = spices.asSequence().filter{it.startsWith('c')}.filter{it.endsWith('e')}
    println(spicesStartCEndE2.toList())


    val spices3C = spices.take(3).filter { it.startsWith('c') }
    println(spices3C)

}