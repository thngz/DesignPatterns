package proxy

interface Repository {
    fun query(query: String) : String
}