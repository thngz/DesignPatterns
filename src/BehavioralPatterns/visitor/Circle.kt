package visitor

class Circle: Shape {
    override fun accept(v: Visitor) {
        v.visitCircle(this)
    }
}