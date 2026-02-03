package romo.manuel.kotlinbootcamp_romomanuel.modulo5.quiz55

/**
 * Autor: Manuel Romo López
 * ID: 00000253080
 */

fun main(args : Array<String>){

    val allBooks = setOf("Hamlet", "Romeo y Julieta", "Macbeth", "Othelo", "El sueño de una noche de verano")
    val library = mapOf("William Shakespeare" to allBooks)

    println(library.any {it.value.contains("Hamlet")})

    val moreBooks = mutableMapOf<String, String>("Charles Dickens" to "Grandes esperanzas")

    moreBooks.getOrPut("Guerra y paz") {"León Tolstói"}

    println(moreBooks)

}