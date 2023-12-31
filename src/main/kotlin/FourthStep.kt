package org.example

/*
    코틀린에서의 조건문은 if와 when이 있다.
    if와 when 중 써야한다면 되도록 when을 사용하도록 하자
 */

fun main() {
    ifMethod()
    whenMethod()
    whenMethod2()
    whenMethod3()
    rangeMethod()
    rangeMethod2()
    rangeMethod3()
    whileMethod()
    exercise1()
    exercise2()
    exercise3()
    exercise4()
}

fun ifMethod() {
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)

    // 코틀린에서는 삼항 연산자 ? 대신 else를 써야한다.

    val a = 1
    val b = 2

    println(if (a > b) a else b)
}

fun whenMethod() {
    // when은 적합한 조건문을 찾을 때까지 실행한다.
    // 출력 결과는 항상 처음에 적합한 조건문이 실행된다.
    val obj = "Hello"

    when (obj) {
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else -> println("UnKnown")
    }

}

fun whenMethod2() {
    // when을 사용하는 경우 else는 필수로 써야한다.
    val obj = "Hello"

    val result = when (obj) {
        "1" -> "one"
        "Hello" -> "greeting"
        else -> "unknown"
    }

    println(result)
}

fun whenMethod3() {
    val temp = 18

    val description = when {
        temp < 5 -> "very cold"
        temp < 10 -> "a bit cold"
        temp < 20 -> "warm"
        else -> "hot"
    }

    println(description)
}

fun rangeMethod() {
    for (a in 1..4){
        print(a)
    }
    println()
    for (a in 1..<4) {
        print(a)
    }
    println()
    for (a in 4 downTo 1) {
        print(a)
    }
    println()
    for (a in 1..5 step 2) {
        print(a)
    }
    println()
    for (a in 'a'..'d') {
        print(a)
    }
    println()
    for (a in 'z' downTo 'a' step 2) {
        print(a)
    }
    println()
}

fun rangeMethod2() {
    for (number in 1..5) {
        print(number)
    }
    println()
}

fun rangeMethod3() {
    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println ("케이크 $cake")
    }
}

fun whileMethod() {
    var cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
    do {
        println("bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}

fun exercise1() {
    val button = "A"

    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such Button"
        }
    )
}

fun exercise2() {
    var pizzaSlices = 0
    var pizzaSlices2 = 0
    while (pizzaSlices < 8) {
        ++pizzaSlices
        println("There's only $pizzaSlices slice/s of pizza :(")
    }
    println("There are $pizzaSlices slices of pizza Hooray! we have a whole pizza! :D")
    do {
        ++pizzaSlices2
        println("There's only $pizzaSlices2 slice/s of pizza :(")
    }while (pizzaSlices2 < 8)
    println("There are $pizzaSlices2 slices of pizza Hooray! we have a whole pizza! :D")
}

fun exercise3() {
    for (num in 1..100) {
        when{
            num % 15 == 0 -> println("fizzbuzz")
            num % 3 == 0 -> println("fizz")
            num % 5 == 0 -> println("buzz")
            else -> println(num.toString())
        }
    }
}

fun exercise4() {
    val words = listOf("dinosaur", "limousine", "magazine", "language")

    for (word in words) {
        if (word.first() == 'l') {
            println(word)
        }
    }
}