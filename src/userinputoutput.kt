import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter your fullname : ")
    var fullname = readln()
    println("Fullname : $fullname")


    println("How old are you (in years?:")
    var age = read.nextInt()
    println("Age : $age")

    println("Enter weight (in kg?:")
    var weight = read.nextDouble()
    println("Weight : $weight")

    println()

    println("Summary of your information")
    println("Fullname:$fullname")
    println("Age:$age years old")
    println("Weight:$weight kg")
    println("----Thank you!!!---")

}