package iterator.iterators.deprecated

import iterator.composite.Branch
import iterator.composite.Leaf
import iterator.composite.Node
import iterator.iterators.Iterator
import java.util.*

class BreadthFirstIterator(private val node: Node) : Iterator {

    private val queue: Queue<Node> = LinkedList()
    private var currentNode = node

    init {
        queue.offer(currentNode)
    }

    override fun getNext(): Node {
        if (hasMore()) {
            val nextItem = queue.poll()
            if (nextItem is Branch) {
                nextItem.children.forEach { queue.offer(it) }
            }
            return nextItem
        }
        return Leaf(0)
    }

    override fun hasMore(): Boolean {
        return queue.isNotEmpty()
    }
}