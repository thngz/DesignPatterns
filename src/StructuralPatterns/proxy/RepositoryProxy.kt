package proxy

class RepositoryProxy(private val repository: Repository) : Repository {
    private val cache = HashMap<String, String>()
    override fun query(query: String): String {
        if (cache.containsKey(query)) {
            return cache[query]!!
        }
        val remoteResponse = repository.query(query)
        cache[query] = remoteResponse
        return remoteResponse
    }

}