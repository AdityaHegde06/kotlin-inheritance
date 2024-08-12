//base class

 // Base class
open class Person(val name: String, val age: Int) {
    // Method to introduce the person
    open fun introduce() {
        println("Hello, my name is $name, and I am $age years old.")
    }
}
// Derived class 1
class Student(name: String, age: Int, val studentId: String) : Person(name, age) {
    override fun introduce() {
        super.introduce() // Call the introduce method of the parent class
        println("I am a student with ID $studentId.")
    }
}
// Derived class 2
class Teacher(name: String, age: Int, val subject: String) : Person(name, age) {
    override fun introduce() {
        super.introduce() // Call the introduce method of the parent class
        println("I am a teacher, and I teach $subject.")
    }
    
    
    class Sir(name: String, age : Int, val subject:String ):Person(name, age){
      override fun introduce(){
        super.introduce()
        println(" I am  a sir, and I teach $subject.")
        
      }
    }
    class Priciple(name: String, age : Int,val subject:String ):Person(name, age){
      override fun introduce(){
        super.introduce()
        println(" I am  a Principle , I teach $subject")
        
      }
    }
    
}
fun main() {
    val student = Student("Alice", 20, "S12345")
    val teacher = Teacher("Mr. Smith", 35, "Mathematics")
    val sir    = Teacher("Mr.james", 32 , "Physical Education")
    val principle=Teacher("Ms.Bagenzza", 61,"History and English")
    student.introduce()
    teacher.introduce()
    sir.introduce()
    principle.introduce()
  
}