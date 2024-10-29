package com.example.kotlin_learning

fun main() {
    var x = 3
    var y = 4
    var z = 5
//    var result = x+y
//    println("The result is : $result")
//
//    // or directly
//    println(15 % 7)

    println("x : $x")
    println("x + y : ${x + y}")
    println("x + y + z : ${x + y + z}")

    var a : Double = 20.0
    var b : Double = 8.0

    println("The result is ${a / b}")

    // Formula of Sphere
    var radius = 5.5
    var sphere = 0.75 * Math.PI * (radius*radius*radius)
    println("The volume os sphere : $sphere")

    // Strings
    var name = "Maaz Sayyad"
    println("This is my name : ${name[0]}")

    // Comparison Operators
    var p = 10
    var q = 11
    var r = 12
    println(p < q || p > r)

}