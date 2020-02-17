package Main
//Data class
data class User(var name: String, var age: Int){

}

fun main(args: Array<String>){
    var user = User(name = "Ymt", age = 18)
    println(user.toString())
    var backupUser = user.copy()
    user.age = 18
    println("After")
    println(user.toString())
    println(backupUser.toString())
    //hashcode
    println(user.hashCode())
    println(backupUser.hashCode())
    if(user.hashCode() == backupUser.hashCode()) {
        println("same content")
    } else println("different content")
    if(user.equals(backupUser)) {
        println("same content")
    } else println("different content")
}