fun main() {
    hello("Clark")
    hello("Clark", "Kent")
}

fun hello(firstName:String, lastName:String = ""){
    println("Hello $firstName $lastName")
}