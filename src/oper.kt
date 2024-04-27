fun main() {
    //삼항연산
    var a : Int = 5
    var b : Int = if (a==5) 8 else 3
    println(a)
    println(b)

    //엘비스 연산
    //null인지 확인하고 대체값을 넣는 삼항연산 종류 중의 하나
    var number : Int? = 10
    println(number ?: "null 값이었음" ) // ?: null 값인 경우 출력할 내용


}