package decorator

class VerticalScrollBar(window: Window) : WindowDecorator(window) {
    override fun draw() {
        super.draw()
        drawVerticalScrollBar()
    }

    private fun drawVerticalScrollBar() {
        //no-op
    }

    override fun getDescription(): String {
        return super.getDescription().plus(", vertical scrollbar")
    }
}