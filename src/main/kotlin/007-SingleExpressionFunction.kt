//Function that have only one line
fun double(a:Int):Int = a * 2

fun hi(name:String): Unit = println("Hi $name")

fun main() {
    val result = double(10)
    println(result)
    hi("Bane")
}