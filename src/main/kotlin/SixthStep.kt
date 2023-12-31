package org.example

import kotlin.random.Random

class SixthStep(val id: Int, var email: String){
    fun printId() {
        println(id)
    }
}

data class User(val name: String, val id: Int)
data class Employee(var name: String, var salary: Int)

class RandomEmployeeGenerator(var min: Int , var max: Int){
    val names = listOf("one", "two", "three")
    fun generateEmployee(): Employee{
        return Employee(names.random(), Random.nextInt(from = min, until = max))
    }
}
fun main() {
    val contact = SixthStep(1, "wngns@naver.com")
    println(contact.email)
    contact.email = "change@naver.com"
    println(contact.email)
    contact.printId()

    var user = User("juhoon", 2019)
    println(user.toString())
    println(user)
    println(user.equals(contact))

    val emp = Employee("Mary", 20)
    println(emp)
    emp.salary += 10
    println(emp)

    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.min = 50
    empGen.max = 100
    println(empGen.generateEmployee())
}

