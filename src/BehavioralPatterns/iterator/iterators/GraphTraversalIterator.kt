package iterator.iterators

import iterator.composite.Branch
import iterator.composite.Leaf
import iterator.composite.Node

abstract class GraphTraversalIterator(node: Node) : Iterator {

    override fun getNext(): Node {
        if (hasMore()) {
            val nextItem = getNextElementOfContainer()
            if (nextItem is Branch) {
                addChildrenToContainer(nextItem)
            }
            return nextItem
        }
        return Leaf(0)
    }

    abstract fun addChildrenToContainer(item: Branch)
    abstract fun getNextElementOfContainer(): Node
    abstract fun initializeContainer(startingNode: Node)
}