import java.util.Scanner
import kotlin.time.Clock

fun main() {
   var read= Scanner(System.`in`)

    println("Enter any number:")
    var number=read.nextInt()

    if(number%2 ==0) {
        println("$number is even")
    }
    else{
        println("$number is odd")
    }
    
}