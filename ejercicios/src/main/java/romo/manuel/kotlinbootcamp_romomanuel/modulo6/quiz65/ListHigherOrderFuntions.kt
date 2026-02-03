package romo.manuel.kotlinbootcamp_romomanuel.modulo6.quiz65

fun main(args: Array<String>) {
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

    print(numbers.divisibleBy { it % 3 })
}
fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    return this.filter { block(it) == 0 }
}

