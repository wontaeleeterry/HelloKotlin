fun main(args: Array<String>){

    // arrayOf 사용
    var array = arrayOf(1, "Lee", true)
    array[0] = 10
    array[2] = "Park"   // Any 형이므로, true를 String 변수로 변경해도 상관없음 (241227)
    println("${array[0]}..${array[1]}..${array[1]}")

    var arrayInt = intArrayOf(10, 20, 30)
    var arrayInt2 = arrayOf<Int>(20, 40, 60)
    var arrayDouble = doubleArrayOf(10.0, 20.0, 30.0)

    // array 사용
    var array3 = Array(3, {i->i*10})
    var array4 = Array<Int>(3, {i->i*10})
    var array5 = IntArray(3, {i->i*10})

    print("${array3[0]}")    // 코틀린의 array 출력 방법?? (241227)
}

