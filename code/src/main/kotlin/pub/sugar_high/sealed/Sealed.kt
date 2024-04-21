package pub.sugar_high.sealed

import pub.sugar_high.sealed.other.PersianCat

sealed class Animal(val favoriteFood: String)

class Dog(favoriteFood: String) : Animal(favoriteFood)

class Horse(favoriteFood: String) : Animal(favoriteFood)

fun main() {
    val animals = listOf(Horse("apples"), Dog("slippers"), PersianCat("ki-sikil-lil-la-ke"))
    animals.forEach { println(it.favoriteFood) }
}
