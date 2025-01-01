package chap05.section3.openclass

// 상속이 가능한 클래스 open 사용
open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

// 주 생성자를 사용하는 상속
// class 파생 클래스 이름 : 기반 클래스 이름() {}
class Lark(name: String, wing: Int, beak: String, color: String) : Bird(name, wing, beak, color) {
    fun singHitone() = println("Happy Song!")  // 새로 추가한 메서드 - 기반 클래스의 메서드는 모두 포함
}

class Parrot : Bird {
    val language: String   // 프로퍼티 추가

    constructor(name: String, wing: Int, beak: String,
                color: String, language: String) : super(name, wing, beak, color) { // 상위 클래스의 프로퍼티 접근 super
                    this.language = language   // 새로 추가한 프로퍼티
                }
    fun speak() = println("Speak! $language")
}

fun main(args: Array<String>){
    val coco = Bird("MyBird", 2, "short", "blue")
    val lark = Lark("MyLark", 2, "long", "brown")
    val parrot = Parrot("MyParrot", 2, "short", "multiple",
        "Korean") // 프로퍼티 추가

    println("Coco: ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("Lark: ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}")
    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
    lark.singHitone()
    parrot.speak()
    lark.fly()
}