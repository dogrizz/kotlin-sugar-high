package com.deloitte.extension.abs

fun String.toExternalCustomerMTQP666IdFormat(): CustomerMTQP666Id{
    return CustomerMTQP666Id(this.codePoints().toString())
}

@JvmInline
value class CustomerMTQP666Id(val id:String)
