// 클래스 이름이 중복되지 않도록 주의

class User2 {
    lateinit var lateData: String    // 데이터 형태만 지정하고 값을 선언하지 않
}
fun main(args: Array<String>) {
    // lateinit
    var user = User2()
    user.lateData = "Hello"
    println(user.lateData)

}