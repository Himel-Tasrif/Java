//Tasrif Nur Himel

/*
                                                *** Method Overloading ***
*/                                    

public class method_overloading {
    //method 1
    void add(int a, int b){
        System.out.println("The sum is: "+(a+b));
    }

    //method 2
    void add(double a, double b){
        System.out.println("The sum is: "+(a+b));
    }

    //method 3
    void add(int a, double b){
        System.out.println("The sum is: "+(a+b));
    }

    //method 4
    void add(){
        System.out.println("No value");
    }

    public static void main(String[] args) {
        method_overloading obj1 = new method_overloading();
        obj1.add(1,2);
        obj1.add(1.5,2.5);
        obj1.add(1,2.5);
        obj1.add();

    }
}
