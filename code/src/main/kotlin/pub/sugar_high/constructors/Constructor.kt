package pub.sugar_high.constructors

class Constructor @Suppress constructor(val property: String, param: String = "three") {

    private var paramCalculated: String = param
    private var paramCalculated2: String

    init {
        paramCalculated2 = param.uppercase()
    }

    constructor(property: String) : this(property, property.lowercase()) {
        paramCalculated2 = "derp"
    }

    override fun toString(): String {
        return "Constructor($property, $paramCalculated, $paramCalculated2)"
    }

}

fun main() {
    println(Constructor("one", "two"))
    println(Constructor("one"))
}
