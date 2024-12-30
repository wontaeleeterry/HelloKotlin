// 주 생성자가 선언되어 있다면, 보조 생성자는 무조건 주 생성자를 호출해야 한다.

class User11(name: String) {              // 주 생성자
    init {
        println("init Block... $name")
    }
    constructor(name: String, age: Int): this(name) {   // 보조 생성자
        println("constructor... $name ... $age")
    }
}

fun main (args: Array<String>) {
    var user22 = User11("Lee")
    var user33 = User11("Park", 33)
}