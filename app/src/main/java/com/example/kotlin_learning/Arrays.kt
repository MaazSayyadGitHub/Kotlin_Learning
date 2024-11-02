package com.example.kotlin_learning

import kotlin.math.pow

fun main() {
//    val arr = arrayOf(1, 2, 3, 4)
//
//    var i = 0
//    while (i < arr.size){
//        print(arr[i] + " ")
//        i++
//    }
//
//    println("OUt of loop")

//    for (i in 0..arr.size){
//        println(arr[i])
//    }

    // assignment program
//    println("Enter the Number : ")
//    val intUserInput = readln()
//    var intVar = intUserInput.toInt()
//
//    println("Lets count from $intVar down to 0: ")
//    while (intVar >= 0){
//        println(intVar)
//        intVar--
//    }
//    for (i in intVar downTo 0){
//        println(i)
//    }

    // assignment program
//    println("Enter No 1 :")
//    val num1 = readln().toDouble()
//    println("Enter No 2 :")
//    val num2 = readln().toDouble()
//
//    val pow = num1.pow(num2)
//    println("${num1.toInt()} to the power of ${num2.toInt()} is ${pow.toInt()}")

//    val arr = arrayOf(1, 84, 956, 32, 23, 3, 78)
//    var max = arr[0]
////    println(max)
//    for (i in arr){
//        if (i > max)
//            max = i
//    }
//    println("max = $max")

    val arr1 = arrayOf(1, 2, 3, 4, 5, 6, 7)
    var res = 0
    for (i in arr1)
        res += i

    println(res)



}