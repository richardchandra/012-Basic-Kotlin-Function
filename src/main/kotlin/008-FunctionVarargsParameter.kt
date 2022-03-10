//VarArgs means it can receive more than one input, we can assume it likes an array
//We don't have to make array first
//Varargs must be placed as the last parameter
fun finalValue(name:String, vararg values:Int){
    var total = 0.0
    for (value in values){
        total += value
    }
    total /= values.size
    println("Final value $name = $total")
}

fun countTotal(vararg values:Int):Int{
    var total = 0
    for (value in values){
        total += value
    }

    return total
}

fun main() {
    //We can add many integer value, but have to be a same type
    val result = countTotal(10, 10, 10, 10, 10)
    println(result)
}

