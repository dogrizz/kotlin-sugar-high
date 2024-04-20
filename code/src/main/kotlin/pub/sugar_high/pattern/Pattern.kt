package pub.sugar_high.pattern

fun main() {
    for (i in 0..<15){
         println(when {
             i in 0..<10 -> "$i digit"
             (i % 5 == 0) -> "buzz"
             else -> "$i number"
        })
        when(i) {
            1,2 -> "one or two"
            else -> "don't care"
        }
    }
}
