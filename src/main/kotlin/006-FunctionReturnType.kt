//Function that return data
fun sum(a:Int, b:Int):Int{
    val total = a+b
    return total
}

fun division(a:Int, b:Int):Int{
    if (b==0){
        return 0
    } else {
        val result = a/b
        return result
    }
}

fun main() {
    val result = sum(10, 10)
    println(result)
    val divResult = division(10, 2)
    println(divResult)
}