package pub.sugar_high.operator

operator fun Int.plus(other: Int): Int = "$this$other".toInt()
infix fun Int.add(other: Int) = "$this$other".toInt()

fun main() {
    println(12 + 15)
    println(12 add 15)
}
