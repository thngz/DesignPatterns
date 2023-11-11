package prototype

abstract class Shape {
    var x = 0
    var y = 0
    var color = ""

    constructor() {}

    constructor(source: Shape) {
        x = source.x
        y = source.y
        color = source.color
    }

    abstract fun clone(): Shape

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Shape

        if (x != other.x) return false
        if (y != other.y) return false
        return color == other.color
    }

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        result = 31 * result + color.hashCode()
        return result
    }


}