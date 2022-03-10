fun String.hello():String{
    return "Hello $this"
}

fun String.printHello():Unit = println("Hello $this")

fun main() {
    val name: String = "Eko"
    val hello: String = name.hello()
    println(hello)

    "Tom".printHello()
}