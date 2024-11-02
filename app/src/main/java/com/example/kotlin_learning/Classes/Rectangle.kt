package com.example.kotlin_learning.Classes

class Rectangle(val base : Double, val height : Double) : Shape("Rectangle") {
    init {
        println("$name Created with base - $base and height - $height")
    }

    // userDefined functions
    private fun area() = base * height
    private fun perimeters() = 2 * base + 2 * height
    private fun isSquare() = base == height
}