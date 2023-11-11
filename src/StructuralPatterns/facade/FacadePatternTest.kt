package facade

import org.junit.Test

class FacadePatternTest {
    @Test
    fun connectToSQL() {
        val dbType = DatabaseType.SQL
        Repository().connect(dbType)
    }

    @Test
    fun connectToNoSQL() {
        val dbType = DatabaseType.NOSQL
        Repository().connect(dbType)
    }
}