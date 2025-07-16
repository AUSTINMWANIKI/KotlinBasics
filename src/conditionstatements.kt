import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter any number :")
    var number = read.nextInt()

    if (number > 0){
        println("$number is positive")
    }
    else if (number < 0){
        println("$number is negative")
    }
    else{
        println("$number is neutral")
    }


}