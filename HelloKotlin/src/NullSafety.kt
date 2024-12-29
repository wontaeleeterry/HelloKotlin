// ? 물음표 사용법 : https://devforyou.tistory.com/14
// 코틀린에서는 기본적으로 Null 값을 허용하지 않는다.
// -> 객체 생성과 동시에 값의 초기화가 필요하다.

// Null 체크 연산 : ?
// ?. 연산자는 Null Safe operator의 의미

fun main(args: Array<String>) {
    var data2: String? = "Lee"
    var length2: Int? = data2?.length
    println(length2)

    data2 = null         // 앞에서 ?표 초기화 되어 있어 -> null 값을 할당해도 에러가 발생하지 않는다.
    length2 = data2?.length
    println(length2)

    // 예외 발생 연산자 !!

    var data3: String? = "Lee"
    data3!!.length

    data3 = null
    data3!!.length   // Exception error 발생 (241228)

}