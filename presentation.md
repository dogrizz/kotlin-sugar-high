<!-- theme: default -->
<!-- class: invert -->
<style>
  h1 {
    color: #26890d;
    position: absolute;
    top: 60px;
    left: 75px;
    right: 75px;
  }
</style>

# Kotlin Sugar High

Discussing about taste

---

# $> whoami

## Dominik Zmitrowicz

Professionaly fighting with imposter syndrome since 2009.

Pretending to know Kotlin for 2 years.

---

# What is this about

 - Kotlin
 - Sugar
 - Nightmares

---

![Sugar nightmares](flaky.png)

---
<style scoped>
    h2 {
      text-decoration-line: underline;
      text-decoration-style: wavy;
      text-decoration-color: white;
    }
</style>

# What is this about
## 11 kinds of programmers

 - one way enjoyers
 - muh freedom!

---

<style scoped>
    h2 {
      text-decoration-line: underline;
      text-decoration-style: wavy;
      text-decoration-color: white;
    }
</style>

# What is this about
## 11 kinds of programmers

 - one way enjoyers
 - muh freedom!
 - I am sure I can write it in one line

### I will be exaggerating

---

# Not about

 - performance
 - bytecode
 - coroutines

---
# Sealed classes

``` kotlin

sealed class Animal(val favoriteFood: String)

class Dog(favoriteFood: String) : Animal(favoriteFood)

class Horse(favoriteFood: String) : Animal(favoriteFood)

```
---
# Sealed classes

```kotlin
sealed class Demon()

class Cat() : Demon()

class Oni() : Demon()

class Rakshasa() : Demon()

```
---
# Sealed classes

### *Nihil novi*
Already exists in other languages. Also in Java.

### Sub-classes in same package

### Mocking issues
Mockking is fine.

### But still cool!

### Enumy taste

---

# Pattern matching

## Unlock the power of sealed classes

## And much more

---

# Extension functions

``` kotlin
  fun ExternalClass.missingFunction() {}
```

## Cool way to not die from lib poisoning

## Very usefull for writing transformers/converters

---

# Top level

## We don't need no util classes

---

# Constructors and inits

## Fancy shmancy
 - primary 
 - secondary
 - inits

---

# Operator overloading


---

# Scoped functions


---
# Strings

---

# Tricky tricky nullability

## Using java classes

## Compiler is not perfect

## Bang bang!

---

# DSL


---
<style scoped>
  s {
    font-size: 25%;
  }
</style>

# Thank you

## Questions?

~~I hope not~~

## Sources
[Kotlin docs](https://kotlinlang.org/docs/home.html)
[6 magic sugars to keep your kotlin codebase happy](https://medium.com/@piotr.slesarew/6-magic-sugars-that-can-make-your-kotlin-codebase-happier-part-1-ceee3c2bc9d3)
[Kotlin pitfalls and how to avoid them](https://the-cogitator.com/posts/blog/2017/10/02/kotlin-pitfalls-and-how-to-avoid-them.html)

## Slides and code
https://github.com/dogrizz/kotlin-sugar-high

