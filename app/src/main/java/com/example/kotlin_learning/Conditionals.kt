package com.example.kotlin_learning

fun main() {
    val x= 8
    val y= 10
    val z = if (x > y)  6  else  7
    println("Z - $z")

    if (x < y){
        println("x < y")
    } else if (x > y) {
        println("x > y")
    } else {
        println("x == y")
    }

    // String is Palindrome or not
    val string = "cat"
    val revereString = string.reversed()
    if (string.equals(revereString)) {
        println("String is palindrome")
    } else {
        println(" Not Palindrome")
    }

}