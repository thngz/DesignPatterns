package iterator.iterators

import iterator.composite.Branch
import iterator.composite.Node
import java.util.Stack


class DfsIterator(node: Node): GraphTraversalIterator(node) {
    private val stack = Stack<Node>()

    init {
        initializeContainer(node)
    }

    override fun addChildrenToContainer(item: Branch) {
        item.children.forEach { stack.push(it) }
    }

    override fun getNextElementOfContainer(): Node {
        return stack.pop()
    }

    override fun initializeContainer(startingNode: Node) {
        stack.push(startingNode)
    }

    override fun hasMore(): Boolean {
        return stack.isNotEmpty()
    }
}