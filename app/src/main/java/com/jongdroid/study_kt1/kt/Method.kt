package com.jongdroid.study_kt1.kt

// Method
// - 04.함수
// input을 넣어주면 output 이 나옴
//  y = x + 2  --> x 에 넣는 값에 따라서 아웃풋이 다름

// - 함수 선언하는 방법
// fun 함수명 (변수명: 타입, 변수명:타입 ....) : 반환형 {
//  함수 내용
//  return 반환 값
// }


// 함수 이름은 플러스 이고, 인자 두개를 받는데, 두 인자 타입 모두 인트, 그리고 최종 결과 값은 인트를 내보낼 것이다.
// result 라는 친구는 first 와 second 를 더한 값이다.
// 그리고 result 값을 리턴해준다.

// 해당 함수는 메인함수에서 사용한다.
fun plus(first: Int, second: Int): Int {
    val result = first + second
    return result
}






fun main(array: Array<String>) {
    // 함수를 호출 하는 방
    // 인자를 넣는다.
    // plus(5,10) // 5와 10이 전달  first = 5 , second = 10
    // 이걸 출력하려면?
    val result = plus(5, 10)
    println(result)

    // 인수를 명시적으로 전달해서 순서를 변경해줄 수 있다.
    val result2 = plus(second = 100, first = 200)
    println(result2) // 300이 출력됨
}