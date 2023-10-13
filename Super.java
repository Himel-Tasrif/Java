// Tasrif Nur Himel

/*
                                            *** Super ***

 */


class vehicle{
    String color;
    double weight;

    vehicle(String c, double w){
        color = c;
        weight = w;
    }

    void display(){
        System.out.println("Color: "+color);
        System.out.println("Weight: "+weight+ " kg");
    }
}

class car extends vehicle{
    int gear;

    car(String c, double w, int g){

        //color = c;
        //weight = w;
        super(c,w); // always first line .
        gear = g;

    }
    @Override
    void display(){
        super.display();
        System.out.println("Gear: "+gear);
    }
}
public class Super{
    public static void main(String[] args) {
        car obj1 = new car("Red", 350, 4);
        obj1.display();
    }
}
