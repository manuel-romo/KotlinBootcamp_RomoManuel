package romo.manuel.kotlinbootcamp_romomanuel.modulo4.quiz48

/**
 * Autor: Manuel Romo López
 * ID: 00000253080
 */

open class Book (val title: String, val author: String) {

    private var currentPage = 0

    open fun readPage() { currentPage++ }

}

class eBook(var format : String = "text", title: String, author: String) : Book(title, author){

    var wordCount = 0
    override fun readPage() { wordCount += 250 }
}