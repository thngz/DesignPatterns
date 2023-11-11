package decorator

class HorizontalScrollBar(window: Window) : WindowDecorator(window) {
    override fun draw() {
        super.draw()
        drawHorizontalScrollBar()
    }

    private fun drawHorizontalScrollBar() {
        //no-op
    }

    override fun getDescription(): String {
        return super.getDescription().plus(", horizontal scrollbar")
    }
}