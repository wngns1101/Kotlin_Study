package org.example

fun main() {
    helloWorld()
    variable()
    stringTemplate()
    firstStepExercise()
}

fun helloWorld() {
    val name = "juhoon"

    println("Hello, " + name + "!")
    println("Hello, $name!")

    for (i in 1..5) {
        println("i = $i")
    }
}

fun variable() {
    // val은 읽기 전용 변수 한 번 값을 할당하면 수정 불가
    // var은 변하는 변수

    val popcorn = 5
    val hotDog = 7
    var customers = 10

    customers = 8

    println(customers)
    println(popcorn)
    println(hotDog)
}

fun stringTemplate(){
    // 템플릿 안에서 계산을 하려면 {}블럭을 사용해야 한다.
    val customers = 10

    println("There are $customers customers")
    println("There are ${customers+1} customers")
}

fun firstStepExercise() {
    val name = "Mary"
    val age = 20
    println("${name} is ${age} years old")
}