fun main() {
//    var yujin : Idol = Idol( name = "안유진", age = 22, group = "아이브")
//    println(yujin.name)
//    yujin.introduce()

      var yujin1 : Idol = Idol( name = "안유진", age = 22, group = "아이브")
      var yujin2 : Idol = Idol( name = "안유진", age = 22, group = "아이브")

    println(yujin1 == yujin2)  //해시코드가 다르기 때문에 false값이 출력됨

}
//아이돌은 이름과 나이가 있고, 직업은 고정, 소속 그룹이 있고, 자기소개를 할 수 있어야 함
open class Human (
    var name : String,
    var age : Int
) {
    open fun introduce() = println("안녕하세요")
}

    class Idol(name: String, age: Int, var group: String) : Human(name, age) {
    override fun introduce() = println("안녕하세요 저는 $name 입니다")
}