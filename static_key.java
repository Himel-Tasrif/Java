// Tasrif Nur Himel

/*
                                          *** Static Variable ***

Static keyword: The static keyword is used in java mainly for memory management. We may apply static 
keyword with veriable, method, blocks and nested class.

The static keyword belongs to the class than instance of the class.

 */


 // Class name should start with an uppercase letter
class Student { 
    String name;
    int id;
    static String varsityName = "Daffodil International University"; // Static keyword

    // Constructor
    Student(String n, int i) {
        name = n;
        id = i;
    }

    // Method for print
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("University Name: " + varsityName + "\n");
    }
}

public class static_key {
    public static void main(String[] args) {
        Student obj1 = new Student("Tasrif Nur Himel", 22135);
        Student obj2 = new Student("Busrat Jahan", 1078);

        obj1.display();
        obj2.display();
    }
}

