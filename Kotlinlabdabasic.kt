/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    var variable : String = "LAAAMBDAAAAAA"
    //var keyword name of the variable: type of the variable = value or body of the variable 
    var v2 = "String"
    // a variable can be directly assigned a value from which it can infer its type. No need 
    // to provide explicit type
    println("This $variable explains how the lambda is formed.")
    println(v2)
    println(sumLambda(2,4))
    println(multipleLambda(2,4))
    println(calculate(10,2,sumLambda)) // Here third arguments is as function
}

var sumLambda : (Int,Int)->Int = { x : Int, y: Int->x+y}  // this is as specifying- var a:String = "Jay"
var multipleLambda = {x: Int,y:Int->x*y}		//this is as specifying- var a = "jay"

fun calculate(a:Int,b: Int,operation : (Int,Int)->Int):Int{ /*Here calculate takes three parameters
    * third parameter operation is of type(Int,Int)->Int i.e. function type, which again takes two parameters
    * and return and integer. */
   return operation(a,b)  // Here third parameter(operation a function type) is being returned
}
