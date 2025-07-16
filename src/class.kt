//A Calculator that enters arithmetic operators, first number and second number using whenstatement
import java.util.Scanner

fun main() {
    print("Enter the firstnumber:")
    val num1 = readln()?.toDoubleOrNull()

    print("Enter an operator(+,-,*,/,%):")
    val operator = readln()

    print("Enter the secondnumber:")
    val num2 = readln()?.toDoubleOrNull()

    //Check for valid number inputs
    if (num1==null || num2 == null){
        print("Invalid number input.")
        return
    }

    //Calculate result using when statement
    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 == 0.0) {
                "Error:Division by zero"
            } else {
                num1 / num2
            }
        }

        "%" -> {
            if (num2 == 0.0) {
                "Error:Modulo by zero"
            } else {
                num1 % num2
            }
        }

        else -> "Invalid operator"
    }

println("Result : $result")

}



