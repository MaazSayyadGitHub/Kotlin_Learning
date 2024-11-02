package com.example.kotlin_learning.Classes

class Circle(val radius : Double) : Shape("Circle") {
    init {
        println("$name Created with radius - $radius")
        println("$name area is - ${area()}")
        println("$name Parameter is - ${perimeter()}")
    }

    // userDefine functions
    private fun area() = Math.PI * radius * radius
    private fun perimeter() = 2 * Math.PI * radius
}