//Function that able to operate between two data
//Rules:
//1. Have to be a function member or extension funtion
//2. Have to had 1 parameter
//3. Parameter can't be varargs and can't have default value
infix fun String.to(type:String):String{
    if(type == "UP"){
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main(){
    val result: String = "Eko" to "UP"
    println(result)
}