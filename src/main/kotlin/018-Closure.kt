//Closure is ability of a function, lambda, or anonymous function to interact with data in the same scope
fun main() {
    var counter:Int = 0

    val lambdaIncrement:() -> Unit = {
        println("Lambda Increment")
        counter++
    }

    val anonymousIncrement = fun(){
        println("Anonymous Function Increment")
        counter++
    }

    fun functionIncrement(){
        println("Function Increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
}