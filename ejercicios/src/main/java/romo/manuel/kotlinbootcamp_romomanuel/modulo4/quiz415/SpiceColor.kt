package romo.manuel.kotlinbootcamp_romomanuel.modulo4.quiz415

/**
 * Autor: Manuel Romo López
 * ID: 00000253080
 */

fun main(args : Array<String>){
    val curry : Curry = Curry("yellow curry", "very spicy")
    println("Curry color: ${curry.color}")

}

sealed class Spice (val name: String, var spiciness : String = "mild", color: SpiceColor) : SpiceColor by color{

    val heat: Int
        get(){
            return when(spiciness){
                "no heat" -> 0
                "mild" -> 5
                "medium" -> 7
                "spicy" -> 10
                "very spicy" -> 15
                "extreme" -> 20
                else -> -1
            }
        }

    init {
        println("Name: ${name}, spiciness: ${spiciness}, heat: ${heat}")
    }

    abstract fun prepareSpice()

}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor): Spice(name, spiciness, color), Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Grinding $name.")
    }

}

interface Grinder{
    fun grind()
}

interface SpiceColor{
    val color: Color
}

object YellowSpiceColor : SpiceColor{
    override val color: Color
        get() = Color.YELLOW
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);
}

// Respuesta a: "What is the effect of doing this?"
// El efecto principal es que obliga a que todas las subclases de Spice se definan dentro del mismo archivo.

// Respuesta a: "Why is this useful?"
// El mayor beneficio es que permite que el compilador verifique, al usar estructuras como when, que todas las subclases de Spice, como Curry,
// se hayan cubierto, y elimina la necesidad de utilizar la sentencia else.