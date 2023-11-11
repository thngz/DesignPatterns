package visitor

interface Visitor {
   fun visitCircle(c: Circle)
   fun visitDot(d: Dot)
   fun visitRectangle(r: Rectangle)
}