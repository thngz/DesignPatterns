package proxy


class Application(private val repository: Repository) {
    fun getStuffFromDB(query : String) {
        val resp = repository.query(query)
        println(resp)
    }

}