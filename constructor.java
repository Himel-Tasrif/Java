 /*                         *** Constructor ***

Construstor is a special type of method that is used to initial 
the object. It has no return type not even (void).         */

// Tasrif Nur Himel


class teacher{
   public String name,gender;
   public int age;

   // constructor are always named by the class name:
   teacher(String n, String g, int a){
    name = n;
    gender = g;
    age = a;

   }
    // Creating method:
    public void display(){
    System.out.println("My name is: "+name);
    System.out.println("Gender: "+gender);
    System.out.println("My age is: "+age+"\n");
    }
   
    }


public class constructor {
    public static void main(String[] args){
        teacher obj1 = new teacher("Tasrif Nur Himel","Male",22); // First Object
        obj1.display();


        teacher obj2 = new teacher("Busrat Jahan","Female",21); // Second Object
        obj2.display();
       }
}