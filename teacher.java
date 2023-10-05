/*    Tasrif Nur Himel


               *** Class & Object ***

 Class: A class is a blueprint that define the properties and behaviors of an object.

 Object: Bundle of related variables and functions.
*/

public class teacher{
   public String name,gender;
   public int age;

    public static void main(String[] args){

    // Creating Object:
     teacher obj1 = new teacher();
     obj1.name = "Tasrif Nur Himel";
     obj1.gender = "Male";
     obj1.age = 22;

    System.out.println("My name is: "+obj1.name);
    System.out.println("Gender: "+obj1.gender);
    System.out.println("My age is: "+obj1.age);
    }
}