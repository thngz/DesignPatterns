package command

import java.util.*

//Sender class/invoker - Initiates requests
class Calculator {
    var operand = 0.0

    private val history = Stack<Operation>()
    var answer = 0.0

    fun executeOperation(operation: Operation) {
        operation.execute()
        history.push(operation)
    }

    fun undo() {
        val commandToUndo = history.pop()
        commandToUndo.undo()
    }


}