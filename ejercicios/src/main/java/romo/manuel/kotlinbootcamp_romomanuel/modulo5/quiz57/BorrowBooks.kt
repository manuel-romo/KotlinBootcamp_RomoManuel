package romo.manuel.kotlinbootcamp_romomanuel.modulo5.quiz57

const val MAXIMUM_BORROWABLE_BOOKS = 10

fun main(args : Array<String>){

    val book : Book = Book("Rayuela", "Julio Cortázar", 1963)

    println(book.canBorrow(5))
    println(book.canBorrow(15))
    book.printUrl()

}

class Book (val title: String, val author: String, val year: Int){

    companion object {
        const val BASE_URL = "http://www.bookcatalogexample.com/"

    }

    fun canBorrow(borrowedBooks: Int): Boolean{
        return borrowedBooks < MAXIMUM_BORROWABLE_BOOKS
    }

    fun printUrl(){
        println(BASE_URL + title + ".html")
    }


}