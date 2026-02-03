package romo.manuel.kotlinbootcamp_romomanuel.modulo6.quiz63

/**
 * Autor: Manuel Romo López
 * ID: 00000253080
 */

fun main(args: Array<String>) {
    val game = Game()
    println(game.path)
    game.north()
    game.south()
    game.east()
    game.west()
    game.end()
    println(game.path)
}

enum class Direction{
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game(){

    val path = mutableListOf<Direction>(Direction.START)

    val north = {path.add(Direction.NORTH)}
    val south = {path.add(Direction.SOUTH)}
    val east = {path.add(Direction.EAST)}
    val west = {path.add(Direction.WEST)}

    val end : () -> Boolean = {
        path.add(Direction.END)
        print("Game over: ")
        println(path)
        path.clear()
        false

    }

}