package pub.sugar_high.extension.abs

import java.util.stream.Collectors

fun String.toExternalCustomerMTQP666IdFormat(): CustomerMTQP666Id {
    return CustomerMTQP666Id(this.codePoints().mapToObj { it.toString() }.collect(Collectors.joining()))
}

@JvmInline
value class CustomerMTQP666Id(val id: String)
