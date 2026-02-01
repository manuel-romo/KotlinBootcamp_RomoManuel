package romo.manuel.kotlinbootcamp_romomanuel.modulo3

import java.util.Random

/**
 * Autor: Manuel Romo López
 * ID: 00000253080
 */

fun main(args : Array<String>){

    val rollDice = {sides: Int -> if(sides > 0) Random().nextInt(sides) + 1 else 0}

    val rollDice2: (Int) -> Int = {sides -> if(sides > 0) Random().nextInt(sides) + 1 else 0}

    gamePlay(rollDice2(4))
    gamePlay2(rollDice2)

}

fun gamePlay(diceRoll: Int){
    println(diceRoll)
}

// Alternativa utilizando la notación de tipo de función:
fun gamePlay2(rollDice: (Int) -> Int){
    println(rollDice(4))
}

// Respuesta a pregunta: ¿Por qué querrías utilizar la notación de tipo de función en lugar de solo lambda?
// Porque hace el código más legible al definir los tipos recibidos y el que se devuelve, además de que
// permite recibir funciones lambda como argumentos en otras funciones, es decir, crear funciones de orden superior.