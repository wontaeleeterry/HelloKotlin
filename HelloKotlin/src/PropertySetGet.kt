class User {
    var name: String = "Lee"   // 수정 가능 : set()
    val age: Int = 20          // 수정 불가능 : get() 만 가능
}

// 클래스에 get(), set() 메서드를 선언하지 않은 것이 당연한 것 같은데 (파이썬 관점에서)
// 코틀린 강의에서는 이 부분에 대해서 특이한 것으로 설명함 -> 자바에서 개선된 점? (241228)

fun main(args: Array<String>){
    val user = User()    // 클래스

    user.name = "Kim"
    println("name: ${user.name}")
    println("age: ${user.age}")
}
