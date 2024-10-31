package com.example.kotlin_learning

fun main() {
//    val list = listOf(1, 2, 3, 4, 5) // we can not manipulate list but can do array - immutable list
//    val mutableList = mutableListOf(1, 2, 3, 4) // mutable can be changed
//    val arr = arrayOf(1, 2, 3)
//
//    arr[0] = 10
//    // list[0] = 20 - X
//    mutableList[0] = 12
//    mutableList.addAll(arr)
//
//    for (i in mutableList) println(i)

    // make a list via inputs
//    println("Enter the elements : ")
//    val userList = mutableListOf<Int>()
//    for (i in 0..10) {
//        val x = readLine()?.toInt()
//        if (x != null) {
//            userList.add(x)
//        }
//    }
//    println(userList)

    // assignment program
//    println("Enter the 5 number : ")
//    val dummyList = mutableListOf<Int>()
//    for (i in 1..5){
//        val input = readln().toInt()
//        dummyList.add(input)
//    }
//    println("The 5 numbers in the reverse order are : ")
//    for (i in 4 downTo 0){
//        println(dummyList[i])
//    }

    // assignment program fibonacci
    println("Enter a number n > 1 :")
    var n = readln().toInt()

    val list = mutableListOf<Int>()
    var a = 0
    var b = 1
    list.add(a)
    list.add(b)

    for (i in 1..n - 2){
        var c = a + b
        a = b
        b = c
        list.add(c)
    }

    println(list)
}

