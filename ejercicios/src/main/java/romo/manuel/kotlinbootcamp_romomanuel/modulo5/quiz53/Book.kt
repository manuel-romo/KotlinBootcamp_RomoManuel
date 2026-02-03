package romo.manuel.kotlinbootcamp_romomanuel.modulo5.quiz53

/**
 * Autor: Manuel Romo López
 * ID: 00000253080
 */

fun main(args : Array<String>){

    val book : Book = Book("El Principito", "Antoine de Saint-Exupéry", 1943)
    println("Here is your book ${book.obtainAuthorTitle().second} written by ${book.obtainAuthorTitle().first}")
    println("Here is your book ${book.obtainAuthorTitleYear().second} written by ${book.obtainAuthorTitleYear().first} in ${book.obtainAuthorTitleYear().third}.")
}

class Book (val title: String, val author: String, val year: Int){

    fun obtainAuthorTitle() : Pair<String, String>{
        return author to title
    }

    fun obtainAuthorTitleYear() : Triple<String, String, Int>{
        return Triple(author, title, year)
    }
}