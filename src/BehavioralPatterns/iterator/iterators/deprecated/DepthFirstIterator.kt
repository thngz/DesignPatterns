package iterator.iterators.deprecated

import iterator.composite.Branch
import iterator.composite.Leaf
import iterator.composite.Node
import iterator.iterators.Iterator
import java.util.Stack

class DepthFirstIterator(node: Node) : Iterator {
    private val stack = Stack<Node>()
    private var currentNode = node

    init {
        stack.push(currentNode)
    }

    override fun getNext(): Node {
        if (hasMore()) {
            val nextItem = stack.pop()
            if (nextItem is Branch) {
                nextItem.children.forEach { stack.push(it) }
            }
            return nextItem
        }
        return Leaf(0)
    }


    override fun hasMore(): Boolean {
        return stack.isNotEmpty()
    }

}