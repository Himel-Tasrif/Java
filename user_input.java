// User input by using loop
// Tasrif Nur himel


/*import java.util.Scanner;
public class himel{
    public static void main(String[] args){
        
        int [] arr = new int[5];
        Scanner a = new Scanner(System.in);
        int num;
        System.out.print("Enter array size: ");
        num = a.nextInt();
        
        System.out.print("Enter "+num+" of Numbers: ");
        for(int i=0; i<num; i++)
        {
            arr[i] = a.nextInt();
        }
        
        System.out.println("The array you entered is: ");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}*/

import java.util.Scanner;

public class user_input{
    public static void main(String[] args){
        int[] arr = new int[10];
        
        Scanner a = new Scanner(System.in);
        int num,sum=0;
        System.out.print("Enter array size: ");
        num = a.nextInt();
        
        System.out.print("Enter "+num+" numbers: ");
        for(int i=0; i<num; i++)
        {
            arr[i] = a.nextInt();
        }
        
        for(int i=0; i<num; i++)
        {
            sum += arr[i];
        }
            System.out.print("The sum of "+num+" numbers is: "+sum);        
        
    }
    
}