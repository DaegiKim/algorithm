package boj._1000

fun main() {
    val a = readLine().orEmpty()
    val sum = a.splitToSequence(" ").sumBy { it.toInt() }
    println(sum)
}