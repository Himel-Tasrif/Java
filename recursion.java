public class recursion {
    int fact(int n){
        if(n == 1)
            return 1;
        else
            return n*fact(n-1);
    }

    public static void main(String[] args) {
        recursion obj1 = new recursion();
        int result = obj1.fact(5);
        System.out.println("The result is: "+result);
    }
}
