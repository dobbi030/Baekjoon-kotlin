import java.util.*

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    val N: Int = scanner.nextInt()

    for (line in 0 until N) {
        repeat(line) { print(" ") }
        repeat(2 * N - 1 - 2 * line) { print("*") }
        println()
    }
}