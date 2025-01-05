package kkang.KotlinStart.examples

fun main() {
    val data1: Array<Int> = Array(3, { 0 })    // 모두 값이 3개인 배열 표현 (250105)
    println(data1.contentToString())              // data1 은 배열의 참고 값이므로 .contentToString() 메서으로 정상적으로 출력
    println() // 개행 문자로 출력(줄바꿈)

    data1[0] = 10
    data1[1] = 20
    data1.set(2, 30)
    println("${data1.size}")
    println("${data1[0]}, ${data1.get(2)}")

    // 기초 타입의 배열
    println()
    val data2: IntArray = IntArray(3, { 0 })
    val data3: BooleanArray = BooleanArray(3, { false })
    println(data2.contentToString())
    println(data3.contentToString())

    // 배열 선언과 동시에 값 할당
    val data4 = arrayOf<Int>(10, 20, 30)
    println(data4.contentToString())


    // List, Set, Map
    val list = listOf<Int>(10, 20, 30)       // 불변
    val mutableList = mutableListOf<Int>(10, 20, 30)  // 추가, 변경 가능
    mutableList.add(3, 40)
    mutableList.set(0, 50)
    println(mutableList)    // 왜 이것은 .contentToString() 없이 출력되는가? (250105)

    var map = mapOf<String, String>(Pair("One", "Korea"), Pair("Two", "Japan"))
    println(map)                   // {One=Korea, Two=Japan}
    println("${map.get("One")}")   // Korea
}