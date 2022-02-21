package com.jongdroid.study_kt1.kt

// 그냥 막 연습하는 공간


fun myMethod(num1: Int, num2: Int):Int  {
    var returnNum = num1 * num2
    return returnNum

}

fun wakeupMethod(time: Int) :Int {
    var time = 5
    return time

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

fun mySumMethod(num1: Int, num2: Int) = num1 + num2

fun printFun(): Unit {
    println("안녕하세요. printMethod 입니다.")
}

fun testIf(a: Int, b: Int): Int {
    if (a > b) {
        return a

    } else {
        return b
    }
}

fun testMethod(a: Int, b: Int) = if (a > b) a else b

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}


fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "안녕"
        is Long -> "Long"
        else -> "찾을 수 없어요."
    }


fun main(array: Array<String>) {

    // number가 1..10 안에 존재하는지 확인
//    val number = 3
//    if (number in 1..10) {
//        println("$number 은 존재해요.")
//    }

    for (x in 1..5) {
        println(x)
    }

//    println(testIf(5, 6))


    // 문자열 보간법 example
    // $ 키워드를 사용했어요.
    val myAge = 20
//    println("저의 나이는 ${myAge}살 입니다.")

    var myValue: String? = "안녕"
    myValue = null


}