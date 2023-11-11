package command

class Subtraction(calculator: Calculator): Operation(calculator) {

    override fun execute() {
        backup()
        calculator.answer -= calculator.operand
    }

    override fun undo() {
        calculator.answer = backup
    }
}