package facade

class SqlDatabase {
    // in order to set up the database you need to call methods in specific order
    fun foo() {
        println("Setting up foo")
    }
    fun bar() {
       println("Running bar")
    }
    fun baz() {
        println("Loggin baz")
    }
}