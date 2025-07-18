//Parent class/Super class/Base class
open class Animal{
    var hasFeathers = true
    var hasWings = false

    fun speak(){
        println("Animal is speaking")
    }
}

//Child class(inheritance)
class Duck : Animal(){
    var color="white"
    fun swim(){
        println("Duck is swimming")
    }
}

fun main() {
    var a = Animal()

    var d =Duck()
    d.speak()
    println(d.color)

}