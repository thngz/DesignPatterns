package decorator

abstract class WindowDecorator(private val window: Window) : Window {
    override fun draw() {
       window.draw()
    }
    override fun getDescription() : String {
        return window.getDescription()
    }
}