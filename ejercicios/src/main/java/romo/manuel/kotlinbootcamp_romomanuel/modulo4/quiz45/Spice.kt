package romo.manuel.kotlinbootcamp_romomanuel.modulo4.quiz45



class Spice (val name: String, var spiciness : String = "mild") {

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

    fun makeSalt() = Spice("salt", "mild")

}