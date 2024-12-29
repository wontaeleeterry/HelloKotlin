fun main(args: Array<String>) {
    var sum: Int = 0
    for (i in 1..10) {     // for문의 조건
        sum += i
    }
    println(sum)

    //--------------------------------------
    val list = listOf("Hello", "World", "!")
    val sb = StringBuffer()

    for (str in list) {
        sb.append(str)
    }
    println(sb)

    //--------------------------------------
    val list1 = listOf("Hello", "World", "!")
    for (i in list1.indices) {   // index 값을 획득하고 한다면 indices를 사용 (241227)
        println(list1[i])
    }
    //--------------------------------------

    var x = 0
    var sum1 = 0
    while (x < 10) {
        sum1 += ++x
        println(x)    // 10 이 포함된다. 
    }
    println("sum is ${sum1}")
}

