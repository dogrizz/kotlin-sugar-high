package pub.sugar_high.strings

fun main() {
    val obj = "humpty"
    val obj2 = null
    println("$obj is cool")
    println("length: ${obj.length}")
    println(
        """

        this is so $obj dumpty

    """
    )
    `this is really cool for tests`()
    println("$obj2")
}

fun `this is really cool for tests`() {
    println("Please don't do that in regular code")
}
