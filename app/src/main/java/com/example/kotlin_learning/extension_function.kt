package com.example.kotlin_learning

fun main() {
    println("Please Enter the No For Prime Check : ")
    val input = readln().toInt()
    // in this we are not passing any parameters
    // we are directly giving integer input to below function
    val res = input.isPrime()
    println(if (res) "$input is Prime" else "$input is not Prime")

    // product of list with extension function
    val list = listOf(1, 2, 3, 4, 5, 6)
    val res1 = list.productOfList()
    println("Product of $list is $res1")
}

// extension function
fun Int.isPrime() : Boolean {
    for (i in 2 until this - 1){ // this is referring to input
        if (this % i == 0){
            return false
        }
    }
    return true
}

// assignment code
fun List<Int>.productOfList(): Int {
    var product = 1
    for (i in this) {
        product *= i
    }
    return product
}