class User5 {
    constructor(){}
    constructor(name: String){}
    constructor(name: String, age: Int){}   // 매개 변수는 var, val로 선언할 수 없음
    // 생성자 오버로딩으로 보조 생성자는 하나의 클래스에 여러개 선언 가능
}

fun main(args: Array<String>) {
    var user6 = User5()
    var user7 = User5("Lee")
    var user8 = User5("Lee", 40)
}