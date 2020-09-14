package com.kotlin.explorer.functions

fun <R, T> List<T>.cool(
        initial: R,
        transform: (acc: R, next: T) -> R) {
    var accumulator: R = initial
    for (el: T in this) {
        accumulator = transform(accumulator, el)
    }
}

fun combine(acc: String, el: Int): String {
    1.times(2)
    return acc.plus(", $el")
}

