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