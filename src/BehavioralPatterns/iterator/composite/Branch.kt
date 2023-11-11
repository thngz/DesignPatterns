package iterator.composite

import iterator.iterators.BfsIterator
import iterator.iterators.DfsIterator
import java.util.LinkedList

class Branch(private val parentElement: Node) : Node {

    val children = LinkedList<Node>()

    override fun visit() {
        parentElement.visit()
    }

    fun getDepthFirstIterator(): DfsIterator {
        return DfsIterator(this)
    }

    fun getBreadthFirstIterator(): BfsIterator {
        return BfsIterator(this)
    }

    fun addChild(node: Node) {
        children.addFirst(node)
    }

    override fun toString(): String {
        return "Branch(parentElement=$parentElement)"
    }


}