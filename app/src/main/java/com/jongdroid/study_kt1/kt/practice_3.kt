package com.jongdroid.study_kt1.kt



var numbering = 1 + 2 + 3 + 4 + 5
var setString = "1"
var chString = setString.toInt()

//스트링 변수 넣기
var getName = "jongdroid"
var setName = "my name is $getName"


// null
// - 없다. 존재 하지 않는다.
// 휴지를 다 씀 == 0  휴지심도 없음 == null

// 자료형 뒤에 물음표(키워드)를 붙이면 null을 취할 수 있는 정수형이 된다.
var abc : Int? = null // "null" 이 절대 아니다. 값이 없다는 것을 뜻한다.




fun main(array: Array<String>) {

    println(setName)
    println(abc)

}