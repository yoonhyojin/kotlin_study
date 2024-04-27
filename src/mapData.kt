fun main() {
/*    var myMap = mapOf(
        "name" to "빵빵이",
        "age" to 24,
        "job" to "학생"

    )

    println(myMap)
    println(myMap["name"])
    println(myMap["age"])  //변경이 안됨
    */

    //변경이 가능함
    var myMap = mutableMapOf(
        "name" to "빵빵이",
        "age" to 25,
        "job" to "학생"

    )
    println(myMap)
    println(myMap["name"])
    myMap["name"] = "옥지"
    myMap["age"] = 20
    println(myMap)

}