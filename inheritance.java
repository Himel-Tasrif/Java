// Inheritance
// Tasrif Nur Himel
//package inheritance;

class person{
    String name;
    int age;


    void display1(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class teacher extends person{
    String q;

    void display2(){
        display1();
        System.out.println("Qualification: "+q);
    }
}

public class inheritance{
    public static void main(String[] args){

        teacher t1 = new teacher();

        t1.name = "Tasrif Nur Himel";
        t1.age = 22;
        t1.q = "B.Sc. in SWE";
        t1.display2();

    }
}
