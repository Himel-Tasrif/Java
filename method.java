/*    Tasrif Nur Himel


               *** Method ***

 Method: A method is basically a behaviour and a class contain many methods.
*/

class teacher{
   public String name,gender;
   public int age;

    // Creating method:
    public void display(){
    System.out.println("My name is: "+name);
    System.out.println("Gender: "+gender);
    System.out.println("My age is: "+age+"\n");
    }
   
    }

public class method {
       public static void main(String[] args){
        teacher obj1 = new teacher(); // First Object
        obj1.name = "Tasrif Nur Himel";
        obj1.gender = "Male";
        obj1.age = 22;
        obj1.display();


        teacher obj2 = new teacher(); // Second Object
        obj2.name = "Busrat Jahan";
        obj2.gender = "Female";
        obj2.age = 21;
        obj2.display();
       }
}
