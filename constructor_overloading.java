// Tasrif Nur Himel


class teacher{
   public String name,gender;
   public int age;

   // constructor are always named by the class name:
   //multiple constructor
   teacher(){
    System.out.println("No values for object 1");
    System.out.println("\n");
   }
   teacher(String n, String g){
    System.out.println("values for object 2: ");
    name = n;
    gender = g;

   }
   teacher(String n, String g, int a){
    System.out.println("values for object 3: ");
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

public class constructor_overloading {
    public static void main(String[] args){
        teacher obj1 = new teacher(); // First Object

        teacher obj2 = new teacher("Busrat Jahan","Female"); // Second Object
        obj2.display();

        teacher obj3 = new teacher("Tasrif Nur Himel","Male",22);
        obj3.display();
       }
}
