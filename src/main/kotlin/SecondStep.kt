package org.example

fun main() {
    basicType1()
    basicType2()
    secondStepExercise()
}

fun basicType1() {
    // 코틀린은 타입 추론이 가능하다.
    var customers = 10

    customers = 8

    customers = customers + 3 // 11
    customers += 7 // 18
    customers -= 3 // 15
    customers *= 2 // 30
    customers /= 3 // 10

    println(customers)
}

fun basicType2() {
    // 변수를 선언하고 나중에 초기화를 할 수 있다.
    // 그 경우에는 : 기호를 사용해야 한다.
    val d: Int
    d = 3

    val e: String = "hello"

    println(d)
    println(e)
}

fun secondStepExercise() {
    val a: Int = 1000
    val b: String = "log message"
    val c: Float = 3.14F
    val d: Long = 100_100_100_100_100L
    val e: Boolean = false
    val f: Char = '\n'

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
}