package romo.manuel.kotlinbootcamp_romomanuel.modulo4.quiz410

/**
 * Autor: Manuel Romo López
 * ID: 00000253080
 */

fun main(args : Array<String>){
    val curry : Curry = Curry("yellow curry", "very spicy")
    println("Curry color: ${curry.color}")

}

abstract class Spice (val name: String, var spiciness : String = "mild", color: SpiceColor) : SpiceColor by color{

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
    val color: String
}

object YellowSpiceColor : SpiceColor{
    override val color: String
        get() = "yellow"
}