package org.example
/*
    Lists : 순차
    Sets : 순서없는 중복없는 Collection
    Maps : 키와 값으로 이루어진 중복없이 하나의 값에만 매핑되는 Collection
 */
fun main() {
    println("리스트")
    listMethod()
    println()
    println("set")
    setMethod()
    println()
    println("map")
    mapMethod()
    println()
    thirdExercise1()
    thirdExercise2()
    thirdExercise3()
}

fun listMethod() {
    /*
        읽기 전용 리스트 생성: listof()
        변경 가능한 리스트 행성: MutableListOf()
     */

    // 읽기 전용 리스트
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    // 변경 가능한 리스트
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

    // 수정을 피하고 싶을 때 MutableList를 List로 캐스팅
    val shapesLocked: List<String> = shapes
    println(shapesLocked)

    // 리스트 인덱스 추출 방법 []
    println(shapesLocked[1])
    println("shapesLocked[1] 인덱스 ${shapesLocked[1]}")

    // 리스트 처음 추출 방법
    println(shapesLocked.first())
    println("처음 인덱스 ${shapesLocked.first()}")

    // 리스트 마지막 추출 방법
    println(shapesLocked.last())
    println("처음 인덱스 ${shapesLocked.last()}")

    // 리스트 카운트 추출 방법
    println(shapesLocked.count())
    println("리스트 카운트 인덱스 ${shapesLocked.count()}")

    // 리스트 내부 값 여부 확인 방법
    println("circle" in shapesLocked)
    println("circle 리스트 내부 확인 여부 ${"circle" in shapesLocked}")

    // 리스트 원소 추가
    shapes.add("pentagon")
    println("리스트 pentagon 추가 ${shapes}")

    // 리스트 원소 삭제
    shapes.remove("pentagon")
    println("리스트 pentagon 삭제 ${shapes}")
}

fun setMethod() {
    /*
        읽기 전용 set 생성: setof()
        변경 가능한 set 생성: mutableSetOf()
     */

    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    println(readOnlyFruit)

    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    // 형변환 방법
    val fruitLocked: Set<String> = fruit
    println(fruitLocked)

    // set 카운트 추출 방법
    println(fruitLocked.count())

    // set 내부 원소 확인 방법
    println("apple" in fruitLocked)

    // set 원소 추가
    fruit.add("watermelon")
    println("set watermelon 추가 ${fruit}")

    // set 원소 삭제
    fruit.remove("watermelon")
    println("set wagermelon 삭제 ${fruit}")
}

fun mapMethod() {
    /*
        읽기 전용 map 생성 mapof()
        변경 가능한 map 생성 mutableMapOf()
     */

    // 읽기 전용 map 생성
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)

    // 변경 가능한 map 생성
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)

    // 형변환
    val juiceMenuLocked: Map<String, Int> = juiceMenu
    println(juiceMenuLocked)

    // 특정 키로 value 추출
    println("apple 가격 추출 ${juiceMenuLocked["apple"]}")

    // map 카운트 추출
    println(juiceMenuLocked.count())

    // map 원소 추가
    juiceMenu.put("coconut", 150)
    println(juiceMenu)

    // map 원소 삭제
    juiceMenu.remove("coconut")
    println(juiceMenu)

    // map 안에 원소 존재 오부
    println(juiceMenu.containsKey("apple"))

    // map 안에 있는 키 모두 출력
    println(juiceMenu.keys)

    // map 안에 있는 value 모두 출력
    println(juiceMenu.values)

    // 키 내부에 있는지 확인
    println("apple" in juiceMenu.keys)

    // 값 내부에 있는지 확인
    println(100 in juiceMenu.values)
}

fun thirdExercise1() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    println("초록과 빨강의 개수의 합 ${greenNumbers.count()+redNumbers.count()}")
}

fun thirdExercise2() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")
}

fun thirdExercise3() {
    val number2word = mapOf(0 to "test", 1 to "test1", 2 to "test3")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}