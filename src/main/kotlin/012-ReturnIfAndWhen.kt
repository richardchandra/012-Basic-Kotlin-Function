fun sayHello(name:String = ""):String{
    return if(name == ""){
        "Hello Bro"
    } else {
        "Hello $name"
    }
}

fun sayHelloToo(name:String = ""):String{
    return when(name){
        "" -> "Hello Bro"
        else -> "Hello $name"
    }
}

fun main() {
    println(sayHello("Bruce"))
    println(sayHello())

    println(sayHelloToo())
}