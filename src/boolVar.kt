fun main() {
    //boolean형 변수선언시 is~와 같이 선언하는 경우가 많다
    var isRunning : Boolean = true
    println(isRunning)

    var a : Int =10;
    //a = a + 1
    //println(a)
    //a++ 후위연산: a 변수 사용 후 연산을 수행
    //++a 전위연산: 먼저 연산을 수행 후 a 실행
    println((a++).toString())  // 후위연산이기 때문에 10이 출력됨
    println(a) // 연산 후 값 a를 출력하여 11이 출력됨

    //문자열연산
    var hello : String = "hello"
    var world : String = "world"
    println(hello + " " + world) // 공백 추가

    var name : String = "빵빵이"
    println("안녕하세요!${name}입니다.")  //중괄호 생략이 가능하지만 name 뒤에는 공백을 줘야함
    println("안녕하세요!$name 입니다.")

    var c : Int = 10
    var b : Int = 5
    println(c > b)
    println(c >= b)

}