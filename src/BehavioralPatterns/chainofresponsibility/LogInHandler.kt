package chainofresponsibility

class LogInHandler : Handler {
    private lateinit var nextHandler: Handler
    override fun setNext(h: Handler) {
        nextHandler = h
    }

    override fun handle(r: RequestType) {
        if (r == RequestType.LOG_IN) {
            println("Handling logging")
        } else {
            println("Passing to next in loginHandler")
            nextHandler.handle(r)
        }
    }
}