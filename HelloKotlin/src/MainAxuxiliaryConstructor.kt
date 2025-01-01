class User5 {
    var name: String = ""
    var age: Int = 0

    constructor() {}

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}

fun main(args: Array<String>) {
    var user6 = User5()
    var user7 = User5("Lee")
    var user8 = User5("Park", 40)

    // Print the name property of user7
    println(user7.name)  // Output: Lee
}

// ChatGPT 코드 수정 (241231)