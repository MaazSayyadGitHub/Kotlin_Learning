package com.example.kotlin_learning.Classes

open class Shape(protected var name : String) {
    init {
        println("I am the Super Class")
    }

    protected fun changeNameOfShape(newName: String){
        this.name = newName
    }
}