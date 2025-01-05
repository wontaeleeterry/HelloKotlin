package chap05.section3.openclass

// https://kangraemin.github.io/android/2021/03/23/abstraction/

// 교실과 학생, 선생님 -> 청소, 청소 구역과 배정된 학생의 문제

// 청소에 배정된 학생은 반드시 이름이 필요하다.
interface CleaningCrew {
    val name: String
    fun startCleanup()     // interface는 프로퍼티의 상태 정보를 저장할 수 없다. 간략한 형태만 표시 - 메서드 내용은 정의할 수 있지 않나? (240103)
}

class StudentFloorCleaning(studentName: String) : CleaningCrew {
    override val name: String = studentName
    override fun startCleanup() {
        println("$name : Start cleaning floor!")
    }
}

class StudentForWindowCleaning(studentName: String) : CleaningCrew {
    override val name: String = studentName
    override fun startCleanup() {
        println("$name : Start cleaning window!")    // 각각의 클래스에서 정의(override)된 메서드는 모두 다르다. (240103)
    }
}

// 각 청소 구역을 맡은 청소 당번 학생들은
// 각각의 이름(name)과 청소 구역에 따른 행동(메서드)을 구현한다.

// 선생님 클래스 생성 : 학생을 생성해주고, 그 학생에게 청소를 시킨다.

class Teacher {
    fun makeStudentToCleaning(student: CleaningCrew) {   // student 매개변수에 클래스가 전달? (250102) : 이해 필요...
        println("Hey ! ${student.name}!")        // 전달된 매개변수 - 객체(클래스) 에서 학생의 이름을 추출
        student.startCleanup()
    }
}
// makeStudentToCleaning 메서드 하나로 여러 학생에게 여러 구역에 대한 청소를 지시 가능하다.

fun main(args: Array<String>) {
    // 선생님 생성
    val teacher = Teacher()

    // 학생 collection 생성
    val cleaningCrewCollection = mutableListOf<CleaningCrew>()   // 설명 필요 ---

    for (number in 1..5) {
        // Cleaning Floor
        cleaningCrewCollection.add(StudentFloorCleaning("바닥 쓸기 학생 $number"))
        cleaningCrewCollection.add(StudentForWindowCleaning("유리창 청소 학생 $number"))
        // 공통적인 Interface Collection을 사용하여, 어떤 요소가 추가될 경우 코드 수정 내용이 감소 (240103)
    }

    // 학생 청소
    cleaningCrewCollection.forEach {
        teacher.makeStudentToCleaning(it)
    }

}

