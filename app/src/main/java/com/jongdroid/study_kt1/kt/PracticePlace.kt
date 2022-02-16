package com.jongdroid.study_kt1.kt

// 그냥 막 연습하는 공간


fun myMethod(num1: Int, num2: Int):Int  {
    var returnNum = num1 * num2
    return returnNum

}


fun edd(math: Int, korean: Int, english: Int): Int {
    var myScore = math + korean + english
    myScore = myScore / 3
    return myScore
}

fun foodList(food1: String, food2: String, food3: String): String {
    println(food1)
    return food1

}


fun printMethod() {
    println("저는 그냥 출력만 할거에요1")
    println("저는 그냥 출력만 할거에요2")
    println("저는 그냥 출력만 할거에요3")
    println("저는 그냥 출력만 할거에요4")

}

fun plusMethod(english: Int, math: Int, social: Int): Int {
    var myScore = english + math + social
    myScore = myScore / 3
    return myScore
}

fun simpleMethod(num1: Int, num2: Int) = num1 + num2



fun main(array: Array<String>) {

    var getMyscore = plusMethod(90, 90, 90)
    println(getMyscore)

    val myresult = simpleMethod(3,5)
    println(myresult)
//    printMethod()











//    var result : Int = edd(english = 90, math = 100, korean = 85)
//    println(result)
//
//    /////////////////////////////////////////
//
//    foodList("고기", "과자", "상어")
//
//
//    var getMethod = myMethod(num2 = 200, num1 = 2)
//    println(getMethod)
}