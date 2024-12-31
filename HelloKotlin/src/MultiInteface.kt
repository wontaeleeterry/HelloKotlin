interface MyInterface1 {
    fun myFun1()
}

interface MyInterface2 {
    fun myFun2()
}

open class Super {}

// 클래스에서 상속과 인터페이스 혼용 (241231)
class MyClass: Super(), MyInterface1, MyInterface2 {
    override fun myFun1() {}
    override fun myFun2() {}
    }
}