open class Super {
    open var x: Int = 10
    open fun someFun(){
        println("Super...someFun()")
    }
}

class Sub: Super() {     // Inheritance - () 소괄호
    override var x:Int = 20
    override fun someFun(){
        super.someFun()                   // 오버라이드된 상위 클래스의 메서드에 접근
        println("Sub... ${super.x}...$x") // 오버라이드된 상위 클래스의 프로퍼티에 접근
    }
}

// 상속 : 기존 클래스를 재사용하여 새로운 클래스를 작성하는 것
// 오버라이딩 : 조상클래스로 부터 상속받은 메소드의 내용을 변경하는 것

fun main(args: Array<String>){
    val SuperClass = Super()
    SuperClass.someFun()

    val SuperClass1 = Sub()
    SuperClass1.someFun()   // 상위 클래스의 프로퍼티 x와 오버라이딩된 클래스의 프로퍼티 x 출력
}