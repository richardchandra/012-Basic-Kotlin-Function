//Void in java equals to Unit in Kotlin
fun printHello(name:String?):Unit{
    if (name ==  null){
        println("Hello Bro")
    } else {
        println("Hello $name")
    }
}

fun main() {
    printHello("Thor")
}