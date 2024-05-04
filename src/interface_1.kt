fun main() {

}

interface ImplementIdol{
    //그룹소개
    fun introduce() : Unit
    //인사
    fun sayHello() : Unit

}

class Idol2(
    var name : String,
    var age : Int,
) : ImplementIdol {
    override fun introduce() {
        TODO("Not yet implemented")
    }

    override fun sayHello() {
        TODO("Not yet implemented")
    }
}