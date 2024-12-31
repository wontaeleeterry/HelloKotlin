class Bird2 {
    var name: String
    var wing: Int
    var beak: String
    var color: String
    // 프로퍼티 - 선언만 함

    constructor(name: String, wing: Int, beak: String, color: String) {
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
        // this - 선언된 현재 클래스의 프로퍼티를 나타낸다 - 매개변수를 가져와 초기화
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main(arwgs: Array<String>) {
    val coco = Bird2("TerryBird", 2, "Short", "Blue")

    coco.color = "yellow"  // 색생을 변경
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}