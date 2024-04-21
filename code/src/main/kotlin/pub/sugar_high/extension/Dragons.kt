package pub.sugar_high.extension

/**
 * And here you thought #define true false is bad.
 * Nothing is sacred.
 */
fun String.uppercase(): String {
    return this.lowercase().replace("[!?]*1{2,}".toRegex(), "")
        .unleet()
}

private fun String.unleet() =
    this.replace("4", "a")
        .replace("3", "e")
        .replace("1", "i")
        .replace("5", "s")
        .replace("0", "o")
