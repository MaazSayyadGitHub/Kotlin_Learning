package com.example.kotlin_learning.Classes

fun main() {


    /*
    val rectangle = Rectangle(4.0, 7.0)
    val x = 10
    val y = 20
    println(x.plus(y))

    println("Rectangle area id ${rectangle.area()}")
    println("Rectangle perimeter is ${rectangle.perimeters()}")
    println("Rectangle is a Square or not - ${rectangle.isSquare()}")

    val circle = Circle(5.0)
    val triangle = Triangle(2.0, 4.0, 6.0)

     */

    // inheritance example
//    val shapeCircle  = Circle(5.0)
    // shapeCircle.changeNameOfShape("Maaz") // also i have change it to private to check
    // println("Shape Class Name is ${shapeCircle.name}") // this will not accessible here by protected


    // Abstract Classes
    // we can not create instance/object of shape class because its abstract.
    // val shape = Shape("Shape")

    // rectangle object with different constructor
//    val rectangle1 = Rectangle(1.0) // for single value
//    val rectangle2 = Rectangle(2, 3) // for int values
//    val rectangle3 = Rectangle(4.0, 3.0) // for double values

    // assignment program

//    val list = funGetList()
//    funListResult(list)

    // Companion object call
    // val circle = Circle() // with parenthesis we would call actual class and need to pass radius
    // val circle = Circle.randomRadiusCircle()

    // companion object example for Rectangle
    val rectangle = Rectangle.getRectangle()

    // anonymous class


}
//fun funGetList() : List<Int> {
//    val list = mutableListOf<Int>()
//    for (i in 1..5){
//        val x = readln().toInt()
//        list.add(x)
//    }
//    return list
//}
//
//fun funListResult(list: List<Int>) {
//    println("The List is - $list")
//
//    var pointer1 = 0
//    var pointer2 = list.size - 1
//    for (i in list.indices){ // i = 0, 1, 2
//        if ((pointer1 == pointer2) || (pointer1 > pointer2)){
//            if (pointer1 > pointer2){
//                return
//            }
//            println(list[pointer1])
//            return
//        }
//        println(list[pointer1])
//        println(list[pointer2])
//        pointer1++
//        pointer2--
//    }
//}

