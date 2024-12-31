class Bird(var name: String, var wing: Int, var beak: String, var color: String) {
    // property를 매개변수 안에 var를 사용해 선언하고, 본문에서 제외함
    // val, var 를 사용하여 매개변수를 선언하면 생성자에 this 키워드를 사용하거나
    // 매개변수에 언더스코어를 붙인 다음 생성자에서 인자를 할당할 필요가 없다.

    // 메서드 정의
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main(args: Array<String>) {
    val coco = Bird("mybird", 2, "short", "blue")

    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}