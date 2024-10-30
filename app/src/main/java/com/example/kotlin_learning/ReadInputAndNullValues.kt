package com.example.kotlin_learning

fun main() {

    println("Please Enter Your Age : ")
    val userInput = readln().toInt()
    // val userInput = readLine()?.toInt() this needs safe call to do operations
    if (userInput < 18)
        println("You are not adult")
    else if ((userInput >= 18) && (userInput <= 40))
        println("You are an adult")
    else if ((userInput > 40) && (userInput < 80))
        println("You are old")
    else if ((userInput >= 80) && (userInput <= 100))
        println("You are really old")
}