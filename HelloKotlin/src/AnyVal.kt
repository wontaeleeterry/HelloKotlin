// 코틀린 클래스의 최상위 클래스가 Any

fun getLength(obj: Any):Int{
    if(obj is String){
        return obj.length
    }
    return 0
}

fun main(args: Array<String>){
    println(getLength("Hello"))
    println(getLength(10))

    var array3 = Array(3, {i->i*10})
    println(array3[2])
}

