package visitor

interface Shape {
    fun accept(v: Visitor)
}