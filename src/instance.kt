fun main() {
    var yujin : Idol = Idol( name = "안유진", age = 22, group = "아이브")
    println(yujin.name)
    yujin.name = "유진"
    println(yujin.name)
    yujin.introduce()
}
//아이돌은 이름과 나이가 있고, 직업은 고정, 소속 그룹이 있고, 자기소개를 할 수 있어야 함
class Idol_(
    var name : String, // private로 하면 접근이 불가능하여 값 변경 불가
    var age : Int,
    var group : String
) {
    var hobby: String = "soccer"
        private set // private 명시
    // get() {
    // println("취미 : $field")
    // return field
    // }
    init {
        println("아이돌 객체가 생성되었습니다.")
    }  // 생성자

    fun introduce() : Unit{
        println("안녕하세요 저는 $name 입니다.")
    }

//    fun Idol.toStringType() : String = "이름 : $name, 나이: $age, 그룹: $group"
}