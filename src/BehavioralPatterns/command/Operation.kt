package command

// Our command object
abstract class Operation(val calculator: Calculator) {
    protected var backup = 0.0

    abstract fun execute()
    abstract fun undo()

    fun backup() {
        backup = calculator.answer
    }
}