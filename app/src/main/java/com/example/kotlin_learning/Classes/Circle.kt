package com.example.kotlin_learning.Classes

import kotlin.random.Random


class Circle(val radius : Double) : Shape("Circle") {

    // companion object is not need parenthesis () like Random see.
    // it works as a static in java
    // like Circle.randomRadiusCircle()
    // don't need instance to call companion function
    companion object {
        fun randomRadiusCircle() : Circle {
            val radius = Random.nextDouble(1.0, 10.0)
            return Circle(radius) // this is returning and calling Circle class constructor.
        }
    }

    init {
        println("$name Created with radius - $radius")
        println("$name area is - ${area()}")
        println("$name Parameter is - ${perimeter()}")
    }

    // userDefine functions
//    private fun area() = Math.PI * radius * radius
//    private fun perimeter() = 2 * Math.PI * radius

    // so now we have declare in Shape parent class.
    override fun area(): Double {
        return ImportantNumbers.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * ImportantNumbers.PI * radius
    }
}