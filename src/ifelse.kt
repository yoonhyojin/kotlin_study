fun main() {
    //var isTrue : Boolean = true
    var a : Int =10
    if(a ==10) {
        println(10)
    } else if( a ==5) {
        println(5)
    }
    else {
        println("코드로직")
    }

    //when문
    //한즐코드인 경우 {} 스코프가 없어도 됨
    var b : Int = 8
    when(b) {
        10 ->{
            println(10)
        }
        8 -> {
            println(8)
        }
        5 -> {
            println(5)
        }
        else -> {
            println("없음")
        }
    }


}