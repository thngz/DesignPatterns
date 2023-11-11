package chainofresponsibility

class MemberHandler : Handler {
    private lateinit var nextHandler: Handler
    override fun setNext(h: Handler) {
        nextHandler = h
    }

    override fun handle(r: RequestType) {
        if (r == RequestType.BECOME_MEMBER) {
            println("Becoming member")
        } else {
            println("Passing to next in memberHandler")
            nextHandler.handle(r)
        }
    }

}