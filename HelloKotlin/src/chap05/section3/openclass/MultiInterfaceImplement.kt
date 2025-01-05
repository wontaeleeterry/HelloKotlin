package chap05.section3.openclass

// Interface Horse with run and jump methods
interface Horse {
    fun run() {
        println("The horse is running fast!")
    }

    fun jump() {
        println("The horse jumps over an obstacle!")
    }
}

// Interface Bird with fly and jump methods
interface Bird1 {
    fun fly() {
        println("The bird is flying high in the sky!")
    }

    fun jump() {
        println("The bird jumps off a branch!")
    }
}

// Pegasus class implementing both Horse and Bird interfaces
class Pegasus : Horse, Bird1 {           // 인터페이스를 선언하면 다중 상속이 가능, 자바와 다르게 1개의 클래스만 상속 가능 (250102)
    override fun run() {
        println("The Pegasus is running with grace and speed!")
    }

    override fun fly() {
        println("The Pegasus is flying with powerful wings!")
    }

    // Resolving the jump method conflict
    override fun jump() {
        println("The Pegasus can jump both like a horse and a bird!")  // 이 메서드는 타당한가? 아니면 새롭게 정의된 것인가? (240103)
    }

    // Optional: Call specific interface implementations
    fun jumpAsHorse() {
        super<Horse>.jump()  // 두 클래스에서 모두 동일한 이름의 메서드 jump()가 존재하므로 : super <인터페이스이름>.메서드이름 으로 구분
    }

    fun jumpAsBird() {
        super<Bird1>.jump()
    }
}

fun main() {
    val pegasus = Pegasus()

    pegasus.run()          // From Horse
    pegasus.fly()          // From Bird

    pegasus.jump()         // Combined jump method
    pegasus.jumpAsHorse()  // Horse-specific jump
    pegasus.jumpAsBird()   // Bird-specific jump
}
