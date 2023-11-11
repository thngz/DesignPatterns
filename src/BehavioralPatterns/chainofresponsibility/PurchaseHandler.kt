package chainofresponsibility

class PurchaseHandler : Handler {
    private lateinit var nextHandler: Handler
    override fun setNext(h: Handler) {
        nextHandler = h
    }

    override fun handle(r: RequestType) {
        if (r == RequestType.PURCHASE) {
            println("Purchasing product")
        } else {
            println("Passing to next in purchaseHandler ")
            nextHandler.handle(r)
        }
    }
}