package org.example

fun main() {
    println(sum(1, 2))
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    printMessage("Hello")
    println(simpleSum(1, 2))
    println(circleArea(2))
    println(circleArea2(2))
    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(minutes = 1, seconds = 25))
    println(intervalInSeconds(2))
    println(intervalInSeconds(minutes = 10))
    println(intervalInSeconds(hours = 1, seconds = 1))
    println({string: String -> string.uppercase()}("hello"))

    // lambda filter
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positive = numbers.filter { x -> x > 0 }
    val negative = numbers.filter { x -> x < 0 }
    println(positive)
    println(negative)

    // lambda map
    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { x -> x * 3 }
    println(doubled)
    println(tripled)

    println(uppercase("hello"))
    lambdaExercise1()
}

val uppercase: (String) -> String = {string -> string.uppercase()}

fun sum(a: Int, b: Int): Int {
    return a + b
}

//fun printMessageWithPrefix(message: String, prefix: String) {
//    println("[$prefix] $message")
//}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun printMessage(message: String) {
    println(message)
}

fun simpleSum(x: Int, y: Int) = x + y

fun circleArea(c: Int): Double{
    return c * c * Math.PI
}

fun circleArea2(c: Int): Double = c * c * Math.PI

fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) : Int = ((hours*60) + minutes) + seconds

fun lambdaExercise1() {
    val actions = listOf("title", "tear", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map({action ->"$prefix/$id/$action"})
    println(urls)
}

fun repeatN(n: Int, action: () -> Unit) {

}