package com.deloitte.nullability

class Bang(val field: String?) {

}

fun main() {
    val bang = Bang(null)
    println(bang.field!!)
}