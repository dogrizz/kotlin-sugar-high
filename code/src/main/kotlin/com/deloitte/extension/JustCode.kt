package com.deloitte.extension

import java.util.*
import com.deloitte.extension.MoreDragons.uppercase

fun main() {
    val innocentString = "CzE SK0nt Kl1kAsh?!?!1111"
    println(innocentString)
    println(innocentString.uppercase())
    println(innocentString.lowercase())
    println(innocentString.uppercase(Locale.UK))
}