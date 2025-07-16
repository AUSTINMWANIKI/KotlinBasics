fun main() {
    //Arithmetic operators

    var num1= 30
    var num2= 5

    println(num1+num2)
    println(num1-num2)
    println(num1*num2)
    println(num1/num2)
    println(num1 % num2)

    //Comparison operators
    println(num1 < num2)
    println(num1 > num2)
    println(num1 <= num2)
    println(num1 >= num2)
    println(num1 == num2)
    println(num1 != num2)

    //Assignment operators
    var x = 90
    x -= 4
    println(x)

    //Logical operators
    var log = 56
    println( log < 100 && log > 89 )
    println( log < 100 || log > 89 )
    println(!(log < 100 || log > 89))

}