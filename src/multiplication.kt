//2.Kotlin program to generate a multiplication table

import java.util.Scanner
fun main() {
    print("Enter a number:")
    val number = readln()?. toIntOrNull()

    if(number==null){
        print("Invalid number.Please enter a valid number")
    }

    println("Multiplication table for $number:")
    for (t in 1..10){
        println("$number * $t")
    }

}