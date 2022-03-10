//There is a limit to recursive function
//It is possible to have a stack overflow error
//Stack overflow can be solved in Kotlin
//Tail recursive can't have other operation when calling other function
fun main() {
    tailrec fun display(value:Int){
        println("Recursive $value")
        if(value > 0){
            display(value-1)
        }
    }

    display(10)

    tailrec fun factorialRecursive(value:Int, total:Int = 1):Int{
        return when(value){
            1 -> total
            //Have to contain only function
            else -> factorialRecursive(value - 1, total * value)
        }
    }

    println(factorialRecursive(5))
}