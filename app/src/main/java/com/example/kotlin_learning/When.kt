package com.example.kotlin_learning

fun main() {
    val input = readln()
    when(input){
        "India" -> println("Namaste")
        "USA" -> println("Hello")
        "Germany" -> println("Hallo")
        "Russia" -> println("Privet")
        "Pakistan" -> println("Salam Alaikum")
        else -> println("i dont know")
    }
}