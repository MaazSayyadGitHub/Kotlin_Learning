package com.example.kotlin_learning.Classes

class Triangle(val a : Double,val b: Double, val c : Double) : Shape("Triangle") {
    // name var is referring to Shape clas variable
    init {
        println("Created $name with sides a - $a, b - $b, c - $c")
        println("Area of $name - ${area()}")
        println("Perimeter of $name - ${perimeter()}")
    }

    override fun area() = 0.5 * a * b
    override fun perimeter() = a + b + c
}