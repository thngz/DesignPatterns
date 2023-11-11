package prototype


class Rectangle: Shape {
    var width = 0
    var height = 0
    constructor() {}

    constructor(source: Rectangle): super(source) {
        this.width = source.width
        this.height = source.height
    }

    override fun clone(): Shape {
        return Rectangle(this)
    }
}