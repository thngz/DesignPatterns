package facade

class Repository {
    // facade over multiple database systems

    fun connect(db: DatabaseType) {
        when (db) {
            DatabaseType.SQL -> {
                SqlDatabase().bar()
                SqlDatabase().foo()
                SqlDatabase().baz()
            }

            DatabaseType.NOSQL -> {
                NoSqlDatabase().bar2()
                NoSqlDatabase().foo2()
                NoSqlDatabase().baz2()
            }
        }
    }
}