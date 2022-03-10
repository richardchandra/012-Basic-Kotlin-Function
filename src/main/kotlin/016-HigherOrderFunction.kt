fun main() {

    fun hello(name:String, transformer: (String) -> String):String{
        return "Hello ${transformer(name)}"
    }

    val lambdaUpper = {value:String -> value.toUpperCase()}
    println(hello("Bruce", lambdaUpper))
    println(hello("Clark", {value:String -> value.toLowerCase()}))

    //Another method is trailing Lambda
    //We can add lambda function if ti placed at the end of the function
    val result1 = hello("Eko"){
        value:String -> value.toLowerCase()
    }

    val result2 = hello("Eko"){
            value:String -> value.toUpperCase()
    }

}