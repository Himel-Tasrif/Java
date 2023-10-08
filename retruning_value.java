// Tasrif Nur Himel

// Returing value from method

class himel{
    // squre methid has a return type int 
    int squre(int value){
        return value*value;
    }
}

public class retruning_value {
    public static void main(String[] args){

        himel obj1 = new himel();
        int r = obj1.squre(5);
        

        System.out.println("Squre of 5 is: "+r);

        //you can also use:
        //System.out.println("Squre of 5 is: "+obj1.squre(5));
    }
}
