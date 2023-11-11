package visitor

class ShapeVisitorPrinter: Visitor {
    override fun visitCircle(c: Circle) {
       println("I am visiting circle")
    }

    override fun visitDot(d: Dot) {
        println("I am visiting dot")
    }

    override fun visitRectangle(r: Rectangle) {
        println("I am visiting rectangle`")
    }
}