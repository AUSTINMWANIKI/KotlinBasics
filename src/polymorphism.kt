open class Shape{
    open fun draw(){
        println("Drawing a shape")
    }
}

class Rectangle : Shape(){
    override fun draw(){
        println("Drawing a rectangle")
    }
}

fun main() {
    var s = Shape()

    var r = Rectangle()
    r.draw()
}