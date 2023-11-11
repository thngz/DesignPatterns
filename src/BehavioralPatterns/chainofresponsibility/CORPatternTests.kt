package chainofresponsibility

import org.junit.Test

class CORPatternTests {
    @Test
    fun testChain() {
        val logInHandler = LogInHandler()
        val memberHandler = MemberHandler()
        val purchaseHandler = PurchaseHandler()

        logInHandler.setNext(memberHandler)
        memberHandler.setNext(purchaseHandler)

        logInHandler.handle(RequestType.PURCHASE)
    }
}