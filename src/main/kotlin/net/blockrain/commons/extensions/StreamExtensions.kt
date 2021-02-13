package net.blockrain.commons.extensions

import net.blockrain.commons.ReverseIterator
import java.util.*
import java.util.stream.Collectors
import java.util.stream.Stream
import java.util.stream.StreamSupport

fun <T> Stream<T>.toList(): List<T> =
    collect(Collectors.toList())

fun <T> Stream<T>.reverse(): Stream<T> =
    StreamSupport.stream(
        Spliterators.spliteratorUnknownSize(ReverseIterator(toList()), Spliterator.ORDERED),
        false
    )