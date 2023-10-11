// Tasrif Nur Himel

class Student {
    static int count = 0; // do yourself without static and find the difference

Student(){
    count++;
}
void total(){
    System.out.println("Total Student = "+count);
}
}

public class static_key2{
    public static void main(String[] arg){
        Student obj1 = new Student();
        obj1.total();
        Student obj2 = new Student();
        obj2.total();
        Student obj3 = new Student();
        obj3.total();
    }
}