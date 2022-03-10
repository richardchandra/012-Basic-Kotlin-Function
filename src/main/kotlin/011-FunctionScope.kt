//Function scope is where the function can be accessed
//We can make an inner function
fun main() {
    fun sayHello(name:String):Unit{
        println("Hello $name")
    }

    sayHello("Eko")
}

fun anotherFunction(){
    //sayHello("Eko") will result error
}