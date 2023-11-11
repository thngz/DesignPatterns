package observer

class EmailObserver: Observer {
    override fun update(context: String) {
        println("Sending $context using Email")
    }
}