package com.jongdroid.study_kt1.kt


// 다음과 같이 바로 연산 결과를 리턴할 수 있다.
fun myMethod1(num1: Int, num2: Int): Int {
    return num1 + num2

}

// 내부 함수 (함수 안에 함수가 있음)


fun returnMethod(num1: Int = 3, num2: Int = 5): Int {
    return num1 + num2

}


fun main(array: Array<String>) {
    val result = returnMethod()
    println(result)

}