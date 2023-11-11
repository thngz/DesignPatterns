package command

import org.junit.Test

class CommandPatternTests {
    @Test
    fun foo() {
        val calc = Calculator()

        calc.operand = 15.0
        calc.executeOperation(Addition(calc)) // 15

        calc.operand = 7.0

        calc.executeOperation(Subtraction(calc)) // 15 - 7
        println(calc.answer)
        calc.undo()
        println(calc.answer)
    }
}