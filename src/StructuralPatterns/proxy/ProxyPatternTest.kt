package proxy

import org.junit.Test
import kotlin.system.measureTimeMillis

class ProxyPatternTest {
    @Test
    fun applicationCanQueryFromRepository() {
        val remoteRepo = RemoteRepository()
        val proxy = RepositoryProxy(remoteRepo)
        val firstTime = measureTimeMillis { Application(proxy).getStuffFromDB("test") }
        println("Took $firstTime milliseconds")
        val secondTime = measureTimeMillis { Application(proxy).getStuffFromDB("test") }
        // very short time now as proxy cached the result
        println("Took $secondTime milliseconds")
    }
}