class Student{
    var name="Austin"
    var gender="Male"

    fun walk(){
        println("Walking")
    }

}

fun main() {
    var student1 = Student()
    println(student1.gender)

    student1.walk()
}