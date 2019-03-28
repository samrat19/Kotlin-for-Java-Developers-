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