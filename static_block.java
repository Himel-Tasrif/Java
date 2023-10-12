// Tasrif Nur Himel

class StaticBlock{
    static int id;
    static String name;

    // static block create 
    static {
        id = 1078;
        name = "Tasrif Nur Himel";
        // this is execute before main method
        System.out.println("This is Static Block");
    }

    static void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}

public class static_block{
    public static void main(String[] args) {
        StaticBlock.display();
    }
}