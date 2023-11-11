package iterator

import iterator.composite.Branch
import iterator.composite.Leaf
import org.junit.Test

class IteratorPatternTests {

    @Test
    fun traversesTreeInDFS() {
        val mainBranch = Branch(Leaf(1))

        val secondBranch = Branch(Leaf(2))
        val thirdBranch = Branch(Leaf(5))

        secondBranch.addChild(Leaf(3))
        secondBranch.addChild(Leaf(4))

        thirdBranch.addChild(Leaf(6))
        thirdBranch.addChild(Leaf(7))

        mainBranch.addChild(secondBranch)
        mainBranch.addChild(thirdBranch)

        val it = mainBranch.getDepthFirstIterator()
//        val it = mainBranch.getBreadthFirstIterator()
        while (it.hasMore()) {
            val item = it.getNext()
            item.visit()
        }
    }
}