package chap05.section3.openclass

// 코틀린에서 주생성자를 사용하는 상속 예제를 만들어주세요.
// 그리고 프로퍼티가 한개 추가되는 경우도 예제를 만들어주세요. (250101)

// 상위 클래스 Person
open class Person(val name: String, val age: Int) {
    fun introduce() {
        println("My name is $name, and I am $age years old.")
    }
}

// 하위 클래스 Student, Person 클래스를 상속받음
class Student(name: String, age: Int, val school: String) : Person(name, age) {  // school 이라는 프로퍼티가 추가됨
    fun study() {
        println("$name is studying at $school.")
    }
}

fun main() {
    val student = Student("Lee", 20, "Seoul University")
    student.introduce()  // 상위 클래스의 메서드 호출
    student.study()      // 하위 클래스의 메서드 호출
}
