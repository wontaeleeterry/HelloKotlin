// https://augustin26.tistory.com/39
// 코틀린의 프로퍼티는 사용자 정의 게터와 세터를 가질 수 있다.

class User1 {
    var greeting: String = "Hello"
        // 세터와 게터를 직접 지정하기 (교재 p. 257 참조)
        set(value) {
            field = "Hello" + value   // field - 보조 필드, 프로퍼티 값을 읽는 식별자
        }
        get() = field.toUpperCase()   // toUpperCAse() - 대문자 변경 메서드
}

fun main(args: Array<String>) {
    val user1 = User1()
    user1.greeting = "Lee"
    println(user1.greeting)
}