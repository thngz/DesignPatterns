package decorator

class SimpleWindow : Window {
    override fun draw() {
        // no-op
    }

    override fun getDescription() : String {
      return "simple window"
    }
}