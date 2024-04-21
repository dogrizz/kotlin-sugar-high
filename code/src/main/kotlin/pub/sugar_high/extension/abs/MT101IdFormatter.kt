package pub.sugar_high.extension.abs

import java.util.stream.Collectors

fun String.toExternalCustomerMTQP666IdFormat(): String {
    return this.codePoints().mapToObj { it.toString() }.collect(Collectors.joining())
}
