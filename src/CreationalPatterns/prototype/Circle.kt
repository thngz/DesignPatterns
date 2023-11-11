package prototype

class Circle : Shape {
    var radius = 0

    constructor() {}

    constructor(source: Circle) : super(source) {
        this.radius = source.radius
        this.x = source.x
        this.y = source.y
    }

    override fun clone(): Shape {
        return Circle(this)
    }
}