package com.example.kotlin_learning

import kotlin.math.pow

fun main() {
//    val x = 3
//    val y = 2
//    Pow(x, y)
//    println("x in main")

//    println(add(12, 12))
    // Pow(2, 3)
//    val n = readln().toInt()
//    println("The sum of the values from 1 to $n")
//    println(sum(n))
//
//    println( multi(2, 2))
//    val list = listOf(1, 2, 3, 4, 5)
//    getList(list)

//    val list = listOf(3, 2, 5, 1, 5, 6, 7)
//    println("The List Looks like the following : $list")
//    searchInList(list)

    // vararg in kotlin
    // vararg parameters only get intArray
//    val array = intArrayOf(6, 7, 18)
//    println(getMax(1, 12, 3, 4, 5, *array))
//
//    // default arguments in kotlin
//    searchFun("Black Panther")
//    searchFun("Black Panther", "FireFox")
//    searchFun(search = "How can i goto jail", searchEngine = "Bing") // named parameters in kotlin
//
//    val sumArray = alternatingSum(3, 4, 5, 2, 1, 2, 3)
//    println(sumArray)

    println(alternatingSum(3, 4, 5, 2, 1, 2, 3))
}

/*
fun searchInList(list: List<Int>){
    println("Search for this No :")
    val no = readln().toInt()
    if (no !in list){
        println("-1")
        return
    }
    val index = list.indexOf(no)
    println("The index of $no is $index")
}
fun getList(list: List<Int>){
    for (i in list){
        println(i)
    }
}
fun sum(n: Int) : Int {
    var res = 0
    for (i in 1..n){
        res += i
    }
    return res
}
fun multi(a: Int, b : Int) = a * b
fun Pow(x: Int, y: Int) : Double {
    return x.toDouble().pow(y)
    //println("Value of pow is : $pow")
}
//fun add(a: Int, b: Int): Int {
//    val add = a + b
//    return add
//}
 */

// vararg in kotlin
fun getMax(vararg numbers : Int) : Int {
    var max = numbers[0]
    for (number in numbers){
        if (number > max){
            max = number
        }
    }
    return max
}

// default args in kotlin
fun searchFun(search : String, searchEngine : String = "Google") {
    println("Searching for $search on $searchEngine")
}

fun alternatingSum(vararg numbers: Int) : Int {
    var sum = numbers[0]
    var oddOrEven : String
    for (i in numbers.indices) {
        sum += if (i % 2 == 0) numbers[i] else -numbers[i]
    }
    return sum
}