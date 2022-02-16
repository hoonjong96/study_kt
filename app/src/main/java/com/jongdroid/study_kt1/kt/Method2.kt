package com.jongdroid.study_kt1.kt


// 1.디폴트 값을 갖는 함수 만들기
// 첫번째 인수는 디폴트 값이 없지만, 두번째 인수는 디폴트 값이 있다.
fun add(num1: Int, num2: Int = 5): Int {
    var result = num1 + num2
    return result
}

// 2.반환값이 없는 함수 만들기
// Unit이 의미하는 것은 해당 함수는 아무것도 리턴하지 않겠다는 것을 의미.
// 유닛은 회색으로 되어 있고 생략이 가능 함.
fun printAdd(num1: Int, num2: Int) {
    var result = num1 + num2
    println(result)
}


// 3. 간단하게 함수를 만들기
// 2개의 인자를 받을 수 있다.
fun plusShort(num1: Int, num2: Int) = num1 + num2

// 4. 가변인자를 갖는 함수 선언하는 방법
// vararg = 베리어블 아규먼
// vararg 를 적게 되면 1개부터 n개 까지 인수를 받을 수 있다.
fun printMany(vararg numbers: String) {
    for (number in numbers) {
        println(numbers)
    }
}


fun main(array: Array<String>) {
    // 함수를 호출했을때 두번째 인수에 값을 주지 않는다면 디폴트 값이 적용된다.
    // 두번재 인수에 디폴트 값이 있는데, 값을 준다면 ? = 값을 준 것이 적용된다.
    // 두 인수 모두 디폴트 값을 지정하고, 함수 호출시 값을 안 넣을 수도 있다. = var result = add()
    var result = add(10)
    println(result)

    var result1 = add(num2 = 100, num1 = 300)
    println(result1)

    //100 + 200 결과 값이 출력됨 왜냐하면 해당 함수에서 num1 + num2 후 결과 값을 프린트 찍었음
    printAdd(100, 200)


    var result2 = plusShort(1000, 1000)
    println(result2)

    println()
    printMany("바", "보")
    printMany("코틀린")

}