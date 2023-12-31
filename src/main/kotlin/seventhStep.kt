package org.example

data class Employee2 (val name: String, val salary: Int)

fun main() {
    var neverNull: String = "this can't be null"

    // 컴파일러 에러 ?이 없는 이상 null이 될 수 없음
    // neverNull = null

    // null이 가능한 타입
    var nullable: String? = "Tou can keep a null here"
    nullable = null

    // 타입을 명시하지 않아도 ?가 없으면 null이 올 수 없다.
    var inferredNonNull = "This compiler assumes non-nullable"
//        inferredNonNull = null

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull))
//        println(strLength(nullable))

    var nullString: String? = null
    println(describeString(nullString))
    println(lengthString(nullString))
    println(nullString?.uppercase())
    // 엘비스 연산자 null일시 오른쪽 값 반환
    println(nullString?.uppercase() ?: 0)

    println((1 .. 5).sumOf { id -> salaryById(id) })
}

fun lengthString(nullString: String?): Int? {
    return nullString?.length
}

fun describeString(string: String?): String {
    if (string != null && string.length > 0) {
        return "String of length ${string.length}"
    }else{
        return "Empty or null string"
    }
}

fun employeeById(id: Int) = when(id){
    1 -> Employee2("mary", 20)
    2 -> null
    3 -> Employee2("John", 21)
    4 -> Employee2("Ann", 23)
    else -> null
}

fun salaryById(id: Int) = employeeById(id)?.salary ?: 0