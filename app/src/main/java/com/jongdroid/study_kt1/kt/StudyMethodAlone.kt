package com.jongdroid.study_kt1.kt

fun edd (math: Int, korean: Int, english: Int): Int {
    var myScore = math + korean + english
    myScore = myScore / 3
    return myScore
}

fun foodList (food1: String, food2: String, food3: String): String {
    println(food1)
    return food1

}



fun main(array: Array<String>) {
    var result : Int = edd(english = 90, math = 100, korean = 85)
    println(result)

    /////////////////////////////////////////

    foodList("고기", "과자", "상어")


}