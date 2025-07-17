//3.Kotlin program to check whether a number is prime or not
import java.util.Scanner
fun main() {
    print("Enter a number:")
    val number=readln()?.toIntOrNull()

    if (number==null||number<1){
        print("Invalid.Please enter a valid input")
        return
    }

    if (isPrime(number)){
        println("$number is a prime number")
    }

    else{
        println("$number is not a prime number")
    }
}

fun isPrime(n : Int): Boolean {
    if (n <= 1) return false
    for (t in 2..Math.sqrt(n.toDouble()).toInt()){
        if (n%1==0) return false
    }
    return true
}


