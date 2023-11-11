package proxy

class RemoteRepository : Repository {
    override fun query(query: String): String {
        Thread.sleep(1000)
        return "result ".plus(query).plus("")
    }

}