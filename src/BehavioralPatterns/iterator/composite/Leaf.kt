package iterator.composite

class Leaf(private val id: Int): Node {

    override fun visit() {
        println("Visiting leaf $id")
    }

    override fun toString(): String {
        return "Leaf(id=$id)"
    }

}