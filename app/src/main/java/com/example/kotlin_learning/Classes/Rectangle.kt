package com.example.kotlin_learning.Classes

import kotlin.random.Random


class Rectangle(val base : Double, val height : Double) : Shape("Rectangle") {

    // Constructor and fun Overloading
    // secondary constructor
    // so here we can just take one side for square.
    // constructor(a : Double) : this(a, a) // this is pointing to default or primary constructor

    // and we can make as many constructor
    // but each time we should call primary constructor by (this) keyword and pass their value.
    // constructor(a : Int, b : Int) : this(a.toDouble(), b.toDouble())

    companion object {
        fun getRectangle() : Rectangle {
            val randomBase = Random.nextDouble(1.0, 5.0)
            val randomHeight = Random.nextDouble(1.0, 5.0)
            return Rectangle(randomBase, randomHeight)
        }
    }

    init {
        println("$name Created with base - $base and height - $height")
        println("$name Area is - ${area()}")
        println("$name Perimeter is - ${perimeter()}")
    }

    // userDefined functions
    override fun area() = base * height
    override fun perimeter() = 2 * base + 2 * height
    private fun isSquare() = base == height // its not abstract fun in shape class

}