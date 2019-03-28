fun main(){
    println("First ${foo()}, Second ${foo()}")
}

fun foo():String{
    println("calculating to....")
    return "foo"
}

output

calculating to....
calculating to....
First foo, Second foo

kotlin variables

        i val comes from value Read-Only correspondes final variable in java
        ii var comes from variable , mutable variable

modification of val

val language = mutableListOf("Java")
language.add("kotlin")


kotlin functions

fun checksmall(a :Int, b:Int):Int{
    return if (a<b) a else b
}

transformed to

fun checksmall(a : Int, b : Int):Int = if (a < b) a else b