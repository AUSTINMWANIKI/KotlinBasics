import java.time.Year
import java.util.Scanner

//1.Kotlin program that checks leap year
fun main() {
    val read = Scanner(System.`in`)

    print("Enter a year:")
    var year = read.nextInt()

    if (year == null){
        println("Invalid input . Please enter a valid year.")
        return
    }

    if (isLeapYear(year)){
        println("$year is a leap year")
    }

    else{
        println("$year is not a leap year")
    }
}

fun isLeapYear(year: Int): Boolean{
    return (year %4 == 0 && year %100 !=0) || (year % 400 == 0)
}



