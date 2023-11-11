package visitor

class Rectangle: Shape {
    override fun accept(v: Visitor) {
        v.visitRectangle(this)
    }
}