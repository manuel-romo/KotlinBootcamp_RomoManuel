package romo.manuel.kotlinbootcamp_romomanuel.modulo2

/**
 * Autor: Manuel Romo López
 * ID: 00000253080
 */

fun main(args : Array<String>){

    var rainbowColor = "brown"
    rainbowColor = "green"

    val blackColor = "black"
    // La siguiente instrucción da un error de compilación, porque no se puede modificar el valor de la variable
    // blackColor, al ser declarada con "val": blackColor = "red"

    // La siguiente instrucción da un error de compilación debido a que no se especificó que el
    // valor e la variable rainbowColor puede ser nulo: rainbowColor = null

    var greenColor = null
    var blueColor : Int? = null


}