package net.blockrain.commons.extensions

import net.blockrain.commons.ReverseIterator

fun <T> Iterator<T>.toList(): List<T> =
    with(this) {
        val list = mutableListOf<T>()

        forEach(list::add)

        return list
    }

fun <T> Iterator<T>.reverse(): ReverseIterator<T> =
    ReverseIterator(toList())