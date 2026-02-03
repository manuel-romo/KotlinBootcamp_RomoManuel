package romo.manuel.kotlinbootcamp_romomanuel.modulo5


fun main(args : Array<String>){



}

class Book (val title: String, val author: String, val year: Int){

    fun obtainAuthorTitle() : Pair<String, String>{
        return Pair(author, title)
    }

    fun obtainAuthorTitleYear() : Triple<String, String, Int>{
        return Triple(author, title, year)
    }
}