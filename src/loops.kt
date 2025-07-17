fun main() {
    //While Loop

    var count = 45
    while (count <=50){
        println("Number is $count")
        count++
    }
    //Program 2
    var number = 10
    while (number>=5){
        println(number)
        number--
    }
    //Do While Loop
    var x=1
    do{
        println("Number is $x")
        x++
    }
        while (x<=5)
//For loop
        for (num in 30..40){
            println("Number is $num")
        }
//For loop
        for (letter in 'a'..'d'){
            println("Letter is $letter")
        }
//A simple program that implements break and continue
    var y = 5
    while (y < 50) {
        println(y)
        y++
        if (y==4){
            break
        }
    }


//A simple Kotlin program that uses break and continue
    var z = 5

    while(z > 2){
        println(z)
        z--
        if (z == 3){
              continue
        }
    }



    
}