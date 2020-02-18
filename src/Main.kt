package Main

class Fruit {
    private var watermelon: String = "wtm"
    private var grapes: String = "Dautay"
    private var greenApple: String = "GA"
    class Nested {
        fun sayHello(){
            println("a function inside a NESTED class")
        }
    }
    inner class Inner {
        fun getApple():String {
            println("a function inside an INNER class")
            println("apple is $greenApple")
            return "1"
        }
    }
}

fun main(args: Array<String>){
    Fruit.Nested().sayHello()
    var fruit = Fruit()
    var innerFruit = fruit.Inner()
    innerFruit.getApple()
}