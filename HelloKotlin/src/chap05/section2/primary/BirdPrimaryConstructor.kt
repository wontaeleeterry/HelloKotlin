package chap05.section2.primary

// src 에서 오른쪽 클릭 -> new > Package

class Bird(var name:String, var wing: Int, var beak: String, var color: String) {
    // 프로퍼티 매개변수 안에 var를 사용해 프로퍼티로 선언되어 본문에서 생략함

    // 메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main(args: Array<String>) {
    val coco = Bird("MyBird", 2, "short", "blue")

    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}