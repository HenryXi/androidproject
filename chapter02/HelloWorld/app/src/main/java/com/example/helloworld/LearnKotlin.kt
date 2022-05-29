package com.example.helloworld

import java.util.*
import kotlin.collections.HashMap

fun main() {
    Thread {
        println("Thread is running")
    }.start()

    val list1 = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
    val anyResult = list1.any { it.length <= 5 }
    val allResult = list1.all { it.length <= 5 }
    println("anyResult is " + anyResult + ", allResult is " + allResult)

    val map = HashMap<String, Int>()
    map["Apple"] = 1
    map["Banana"] = 2
    map["Orange"] = 3
    map["Pear"] = 4
    map["Grape"] = 5
    for ((_,value) in map){
        println(value)
    }

    val list = listOf("Apple", "Banana", "Orangeaaa", "Pear", "Grape")
    val leastThen5 = list.filter { it.length < 5 }.map { it.uppercase(Locale.ROOT) }
    val maxLength = list.maxByOrNull {  it.length }
    println("maxlength"+maxLength)
    println("leastThen5:"+leastThen5)
    for(fruit in list){
        println(fruit)
    }


    Singleton.singletonTest()

    val cellphone1 = Cellphone("Samsung", 1299.99)
    val cellphone2 = Cellphone("Samsung", 1299.99)
    println(cellphone1)
    println("cellphone1 equals cellphone2 " + (cellphone1 == cellphone2))


    /**
     * 主构造函数和次构造函数是为了解决多个构造函数的问题
     */
    val student1 = Student()
    val student2 = Student("Jack", 19)
    val student3 = Student("a123", 5, "Jack", 19)
    student1.eat()
    student2.eat()
    student3.eat()
    student2.doHomework()
    student3.readBooks()
    var student = Student()
    student = Student("Jack",19)
//    student = null
    doStudy(student)
}

fun largerNumber(num1: Int, num2: Int): Int {
    return if (num1 > num2) {
        num1
    } else {
        num2
    }
}

fun getScore(name: String) = when (name) {
    "Tom" -> 86
    "Jim" -> 77
    "Jack" -> 95
    "Lily" -> 100
    else -> 0
}

fun checkNumber(num: Number) {
    when (num) {
        is Int -> println("number is Int")
        is Double -> println("number is Double")
        is Float -> println("number is Float")
        is Long -> println("number is Long")
        else -> println("number not support")
    }
}

fun doStudy(study:Study){
    study.doHomework()
    study.readBooks()
}
