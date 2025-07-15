fun main() {

    var text = "Hello world"
    var firstname = "John"
    var lastname ="Njunguna"

    println(text)
    println(text[1])

    //String concatenation
    println(firstname+lastname)
    println(firstname +" "+ lastname)
    //Modifying a string
    println(text.uppercase())
    println(firstname.lowercase())

    //String interpolation
    println("My fullname is $firstname $lastname")

}