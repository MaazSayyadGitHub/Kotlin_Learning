package com.example.kotlin_learning.Classes

abstract class Shape(protected var name : String) {

//    constructor(name2 : String, name3: String) : this(name2+name3)

    init {
        println("I am the Super Class")
    }

    // we have common fun area() and perimeter() in each child class,
    // so we can define it here without body,
    abstract fun area() : Double
    abstract fun perimeter() : Double

    protected fun changeNameOfShape(newName: String){
        this.name = newName
    }
}