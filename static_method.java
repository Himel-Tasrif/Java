// Tasrif Nur Himel

/*
                                    *** Static Method ***
 */


 class Static{
    // Non static method
    void display1(){
        System.out.println("I am non static method");
    }

    // static method
    static void display2(){
        System.out.println("I am static method");     //sout keyboard shortcut
    }
 }
public class static_method {
    public static void main(String[] args) {     // psvm keyboard shortcut
        // if i want to call the display1 (non static method) then first i need to create an object

        Static obj1 = new Static();
        obj1.display1();

        // but if i want to call display2 (static method) then i don't need any object
        // only need class name + method 

        Static.display2();
    }
}
