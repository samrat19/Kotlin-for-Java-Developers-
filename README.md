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



## Named and Default Argument

# Named
println(listof('a','b','c').joinToString(
      separator="", prefix = "(",posyfix = ")")))

# output
abc

# Default Arguments

println(listof(1,2,3).joinToString(posyfix = "."))

# output 
1,2.3.

## Functions: default values

fun displaySeparator(character : Char="*", size : Int = 10){
       repeat(size){
         print(character)
       }
}

## to achive this we use overload in java, which is too much heavier than this



## Control Structer

# if and when

val max = if(a . b) a else b

# there is no ternary operator in kotlin then no operation like this => (a>b)?a:b

# now the when keyword in kotlin

# to achieve the switch case we use when

# in java

String description;

switch(colour){

    case BLUE: description = "Cold";
    break;
    
    case ORANGE: description = "Mid";
    break;
}

# in kotlin

val description = when(colour){

   BLUE -> "Cold"
   ORANGE -> "Mid"
   
}

# loops 

# for loop

val a = listOf("a","b","c")

for(s in a){
  
   print(s)
}

val a = listOf("a","b","c")

for((index,element) in a.withIndex()){
  
   print("$index : $element")
}

val map = mapOf(
               1 to "One",
               2 to "Two",
               3 to "Three")
               
for((key , value) in map){

     println("$key = $value")
}

# output ?? 

for(number in 1..10){

    println(number)
}

# output 

for(number in 1 until 10){

    println(number)
}

# output 

for( ch in "abc"){

   print(ch + 1)
}

# output  bcd

for( number in 10 downTo1 step 2){

    print(number)
}

# in java

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
























