package iterator.iterators

import iterator.composite.Branch
import iterator.composite.Node
import java.util.LinkedList
import java.util.Queue

class BfsIterator(node: Node) : GraphTraversalIterator(node) {
    private val queue: Queue<Node> = LinkedList()

    init {
        initializeContainer(node)
    }

    override fun addChildrenToContainer(item: Branch) {
        item.children.forEach { queue.offer(it) }
    }

    override fun getNextElementOfContainer(): Node {
        return queue.poll()
    }

    override fun initializeContainer(startingNode: Node) {
        queue.offer(startingNode)
    }


    override fun hasMore(): Boolean {
        return queue.isNotEmpty()
    }
}