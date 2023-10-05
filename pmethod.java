//                         *** Perametrised Method ***
// Tasrif Nur Himel


class teacher{
   public String name,gender;
   public int age;

   // perametrised method:
   void setInfo(String n, String g, int a){
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


public class pmethod {
    public static void main(String[] args){
        teacher obj1 = new teacher(); // First Object
        //perameter pass
        obj1.setInfo("Tasrif Nur Himel","Male",22);
        obj1.display();


        teacher obj2 = new teacher(); // Second Object
        //perameter pass
        obj2.setInfo("Busrat Jahan","Female",21);
        obj2.display();
       }
}
