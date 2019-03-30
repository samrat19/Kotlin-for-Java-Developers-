# Kotlin-for-Java-Developers-
KOtlin for java Developers a course by JetBrains

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


 in java

public class Person {

    private final String name;
    private final int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getname(){
        return name;
    }

    public int getage(){
        return age;
    }
}

 in Kotlin
 
class Person(val name:String, val age:Int)

Done, all the constructor and the getter all together

in java

public void updateweather(int degrees){

    String description;
    Colour colour;

    if(degrees < 5){
        description = "Cold";
        colour = BLUE;
    }else if(degrees < 23){
        description = "MID";
        colour = ORANGE;
    }else{
        description = "Cold";
        colour = RED;
    }
}

in kotlin          use pair keyword

fun updateweather(degrees : Int){

    val(description:String , colour:Colour)=
        if(degrees < 5){
            Pair("Cold",BLUE)
        } else if(degrees < 23){
            Pair("Mid",ORANGE)
        } else {
            Pair("HOt",RED)
        }
}

transformed using when keyword

fun updateweather(degrees : Int){

    val(description:String , colour:Colour)= when{
        degrees < 5 -> Pair("Cold",BLUE)
        degrees < 23 -> Pair("Mid",ORABGE)
        else -> Pair("Hot",RED)
    }
}

more short using to keyword

fun updateweather(degrees : Int){

    val(description:String , colour:Colour)= when{
        degrees < 5 -> "Cold" to BLUE
        degrees < 23 -> "Mid" to ORABGE
        else -> "Hot" to RED
    }
}
























