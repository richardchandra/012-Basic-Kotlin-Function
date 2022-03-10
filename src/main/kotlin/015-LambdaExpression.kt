//Function without name

fun toUpper(value:String):String = value.toUpperCase()

fun main() {
    //(String) is the parameter
    // -> String is the return value
    val lambdaName: (String, String) -> String = {
        //Parameter
        firstName:String, lastName:String ->
        //Return value dari lambda function
        val result:String = "$firstName $lastName"
        result
    }

    val name = lambdaName("Bruce", "Wayne")
    println(name)


    //If lambda have only one parameter
    val sayHello: (String)->String = {
        "Hello $it"
    }

    println(sayHello("Clark"))


    //Method reference
    //We create lambda function based on an existing method
    val toUpperCase : (String) -> String = ::toUpper
    println(toUpperCase("Bruce Wayne"))
}