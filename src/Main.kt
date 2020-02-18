package Main

import kotlin.reflect.KProperty

class User {
    var todayTasks: String by DelegatedUser()
}
class DelegatedUser {
    operator fun getValue(thisRef: Any?, property: KProperty<*>) : String{
        return "$thisRef, thanks for delegating '${property.name}' to me !"
    }
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("assigned to '${property.name} in $thisRef. Details: $value'")
    }
}
fun main(args: Array<String>){
    var user = User()
    println(user.todayTasks)
    user.todayTasks = "I make a new project"
}