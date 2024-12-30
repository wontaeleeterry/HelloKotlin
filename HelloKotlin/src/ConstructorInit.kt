class User4(name: String, age: Int) {
    init{
        println("Here Init...")
    }
}

fun main(args: Array<String>) {
    val user6 = User4("Lee", 40)   // 주 생성자로 객체를 생성하면, init 블럭이 자동 실행 (241230)
}