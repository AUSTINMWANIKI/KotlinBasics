import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("Enter marks :")
    var marks = read.nextInt()

    var grade = when{
        marks >= 90 -> "A+"
        marks >= 80 -> "A"
        marks >= 70 -> "A-"
        marks >= 60 -> "B+"
        marks >= 50 -> "B"
        marks >= 40 -> "C+"
        else -> "E"
    }
    println("Scored : $grade")
}
