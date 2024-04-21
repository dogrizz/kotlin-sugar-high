package pub.sugar_high.pattern

import pub.sugar_high.sealed.Dog
import pub.sugar_high.sealed.Horse
import pub.sugar_high.sealed.Lilin
import pub.sugar_high.sealed.other.Cat

fun main() {
    val animals = listOf(Horse("apples"), Dog("slippers"), Cat("ki-sikil-lil-la-ke"))
    for (animal in animals) {
        when (animal) {
            is Dog -> println("bark bark")
            is Horse -> println("neigh neigh")
            is Cat -> println("meow meow")
            is Lilin -> println("hiss hiss")
        }
    }
}

