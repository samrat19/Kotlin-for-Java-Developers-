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
