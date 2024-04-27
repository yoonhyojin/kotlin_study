fun main() {
    var age : Int? = null // ?가 int값이 오지 않았을 때 null값을 자동으로 넣어줌
    if (age != null) {  // age가 null이 아닐 때만 사용해라
        println(age)
        //println(age!!)은 null이여도 강제 수행되게끔 함

    }


}