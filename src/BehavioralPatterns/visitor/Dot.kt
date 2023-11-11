package visitor

class Dot: Shape {
    override fun accept(v: Visitor) {
        v.visitDot(this)
    }
}