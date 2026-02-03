package romo.manuel.kotlinbootcamp_romomanuel.modulo6.quiz68

import kotlin.math.absoluteValue

/**
 * Autor: Manuel Romo López
 * ID: 00000253080
 */

fun main(args: Array<String>) {
    val game = Game()

    while(true){
        print("Enter a direction: n/s/e/w: ")
        game.makeMove(readLine())
    }
}

enum class Direction{
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game(){

    val location = Location()

    val path = mutableListOf<Direction>(Direction.START)

    val north = {
        path.add(Direction.NORTH)
        location.updateLocation(Direction.NORTH)
        true
    }
    val south = {
        path.add(Direction.SOUTH)
        location.updateLocation(Direction.SOUTH)
        true
    }
    val east = {
        path.add(Direction.EAST)
        location.updateLocation(Direction.EAST)
        true
    }
    val west = {
        path.add(Direction.WEST)
        location.updateLocation(Direction.WEST)
        true
    }

    val end : () -> Boolean = {
        path.add(Direction.END)
        print("Game over: ")
        println(path)
        path.clear()
        false

    }

    fun makeMove(move : String?) {
        when(move){
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }

    fun move(where: () -> Boolean){
        where()
    }

}

class Location(val width : Int = 4, val height : Int = 4){
    val map = Array(width) { arrayOfNulls<String>(height) }

    var x = 0
    var y = 0

    init{
        for (i in 0 .. width - 1) {
            for (j in 0 .. height - 1) {
                map[i][j] = "Coordenada [$i, $j]"
            }
        }
    }

    fun updateLocation(direction : Direction) {
        when (direction) {
            Direction.NORTH -> y = (y + 1).rem(height).absoluteValue
            Direction.SOUTH -> y = (y - 1 + height).rem(height).absoluteValue
            Direction.EAST -> x = (x + 1).rem(width).absoluteValue
            Direction.WEST -> x = (x - 1 + width).rem(width).absoluteValue
            else -> {}
        }
        println(map[x][y])
    }

}