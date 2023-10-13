
class a{
    void display(){
        System.out.println("This is A");
    }

}

class B extends a{

@Override
void display(){
    super.display();
    System.out.println("This is B");
}

}

public class method_override {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.display();
    }
}
