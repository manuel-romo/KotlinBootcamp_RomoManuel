package romo.manuel.kotlinbootcamp_romomanuel.modulo5.quiz59

import kotlin.random.Random

/**
 * Autor: Manuel Romo López
 * ID: 00000253080
 */

fun main(args : Array<String>){

    val puppy : Puppy = Puppy()
    val book : Book = Book("Crimen y castigo", "Fiódor Dostoyevski", 1866, 500)

    while(book.pages > 0){
        puppy.playWithBook(book)
        println("${book.pages} left in ${book.title}")
    }


}

class Book (val title: String, val author: String, val year: Int, var pages: Int)

fun Book.calculateWeight(pageCount: Int) : Double{
    return pageCount * 1.5
}

fun Book.tornPages(tornedPages : Int) = if (pages >= tornedPages) pages -= tornedPages else pages = 0

class Puppy(){
    fun playWithBook(book : Book){
        book.tornPages(Random.nextInt(Random.nextInt(1, 20)))
    }
}