package net.blockrain.commons

class ReverseIterator<T>(list: List<T>) : Iterator<T>
{
    private val listIterator: ListIterator<T> = list.listIterator(list.size)

    override operator fun hasNext(): Boolean =
        listIterator.hasPrevious()

    override operator fun next(): T =
        listIterator.previous()
}