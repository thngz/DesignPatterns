package observer

class SmsObserver: Observer{
    override fun update(context: String) {
       println("Sending $context with SMS")
    }

}