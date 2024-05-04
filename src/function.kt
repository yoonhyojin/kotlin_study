fun main() {
    sayHello()
    println(add(1,2))
}
//함수 생성시 앞에 fun을 반드시 입력해야힘
fun sayHello() : Unit {  // return 값이 없으면 생략 가능 또는 Unit 입력하면 됨
    println("hello")
}

fun add(a : Int, b : Int) : Int {  // 맨뒤의 int는 return 값의 타입
    return a + b
}

//코드가 한줄이면 스코프 사용 안하고 =으로 표현 가능함, return 타입은 명시 못함
/*
fun add(a : Int, b : Int)  =  return a + b
}*/
