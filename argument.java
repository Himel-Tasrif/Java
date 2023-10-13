//Tasrif Nur Himel

/*
                                                *** Veriable Length Argument ***
*/                                    

 class test {

    // Argument
    void add(int ... num){
        int sum = 0;
        for(int i : num){
            sum += i;
        }
        System.out.println("The sum is: "+sum);
    }
}


public class argument {

    public static void main(String[] args) {
        test obj1 = new test();
        obj1.add(1,2);
        obj1.add(1,2,3,4);
        obj1.add(1,2,3,4,5,6);

    }
    
}
