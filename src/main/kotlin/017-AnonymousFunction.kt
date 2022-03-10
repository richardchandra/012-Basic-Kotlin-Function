//Like lambda (unnamed) but different way to build it
fun main() {
    val anonymousUpper = fun(value:String):String{
        if(value.isBlank()){
            return "Ups"
        }
        return value.toUpperCase()
    }

    fun hello(name:String, transformer: (String) -> String):String{
        return "Hello ${transformer(name)}"
    }

    val upper = fun(value:String):String{
        if (value == ""){
            return "Ups"
        } else {
            return value.toUpperCase()
        }
    }

    println(hello("Eko", upper))
    println(hello("", upper))

    println(hello("Kurniawan", fun(value:String):String{
        return value.toLowerCase()
    }))
}