package Main

interface BirdInterface {
    fun flyAndFindFood()
}

class Eagle(val age: Int) : BirdInterface {
    override fun flyAndFindFood() {
        println("I'm an eagle, I'm $age  years old.")
    }
}
class Cuckoo(b : BirdInterface):BirdInterface by b {
    //    override fun flyAndFindFood() {
    //        println("I'm a cuckoo. I'm flying and finding food")
    //    }
}
fun main(args: Array<String>){
    val eagle = Eagle(2)
    eagle.flyAndFindFood()
    val cuckoo = Cuckoo(eagle)//interface?
    cuckoo.flyAndFindFood()
}