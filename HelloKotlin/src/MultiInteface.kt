interface MyInterface1 {
    fun myFun1()
}

interface MyInterface2 {
    fun myFun2()
}

open class Super1 {}

// 클래스에서 상속과 인터페이스 혼용 (241231)
class MyClass: Super1(), MyInterface1, MyInterface2 {
//class MyClass: MyInterface1, MyInterface2 {

    override fun myFun1() {}
    override fun myFun2() {}
}

fun main(args: Array<String>){
    val obj = MyClass()
    obj.myFun1()
    obj.myFun2()
}