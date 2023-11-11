package chainofresponsibility

interface Handler {
    fun setNext(h: Handler)
    fun handle(r: RequestType)
}