fun main() {
    //kotlin은 배열의 타입 list를 사용함(array 사용 x)
    //1. array 사용법 : 사용하지 않음
    var arr = listOf(1,2,3,4,5,) // 타입선언 x
    println(arr)
    println(arr[0])
    //arr[0] = 10 // 오류 => 배열: 접근은 가능하나 변경은 안됨

    var arr1 = mutableListOf(1,2,3,4,5)
    println(arr1)
    println(arr1[0])
    arr1[0] = 10  // 변경도 가능함
    println(arr1)

    arr1.removeFirst()
    println(arr1)
    arr1.removeLast()
    println(arr1)

    arr1.addFirst(1)
    println(arr1)
    arr1.addLast(10)
    println(arr1)

    arr1.addAll(3, mutableListOf(1,2,3)) // 3번 인덱스에 배열 [1,2,3]을 추가
    println(arr1)

    arr1.clear() // 배열삭제
    println(arr1)


}