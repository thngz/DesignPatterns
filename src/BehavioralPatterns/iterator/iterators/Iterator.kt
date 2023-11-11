package iterator.iterators

import iterator.composite.Node

interface Iterator {
    fun getNext() : Node
    fun hasMore(): Boolean
}