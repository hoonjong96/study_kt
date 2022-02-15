package com.jongdroid.study_kt1.kt

// 01.  변수

// 변수 정의 = 상자라고 생각하자. 값을 넣어둔다.
// var 또는 val = 상자라고 생각하자
// var 변수명 상자 = 값$
// Variable / Value

// **상자의 특징**
// Variable 은 값을 바꿀 수 있다.
// Value 는 값을 바꿀 수 없다.

// variable 상자 (바꿀 수 있음)
var name = "코틀린"
var number = 99
var score = 99.4

// value 상자(바꿀 수 없음)
val maxSpeed = 200
val codeNum = 2344455222119




fun main(args:Array<String>) {
// maxSpeed = 300 --> value는 값을 바꿀 수 없다.

    //프로그램이 돌때 name에 있는 값을 가져와서 수행한다.
    println(name) // 코틀린 출력
    println(number) // 99 출력

    name = "코틀린 바보"
    number = 199

    println(name)
    println(number)




}