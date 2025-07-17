fun main() {
    var language=arrayOf("Kotlin","Javascript","Java")

   println(language[1])

    //Reassignment element
    language[1] = "Python"
    println(language[1])

    //Looping through an array
    for (lang in language){
        println(lang)
    }

    //Size of an array
    println(language.size)
}