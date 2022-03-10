//Using to many higher order function may badly affect the performance
inline fun hello(name: () -> String):String{
    return "Hello ${name()}"
}

//No inline is let the parameter become not inline
inline fun otherHello(
    firstName:() -> String,
    noinline lastName:() -> String):String{
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {
    println(hello { "Bruce" })
    println(hello { "Wayne" })
}

//The result will look like a common function, but if we open the bytecode, we can see the difference
//Common function will use Function0 class, and everytime it gets called, they created another object
//If we use inline, the compiler will copy the code inside the function and paste it when the function get called
