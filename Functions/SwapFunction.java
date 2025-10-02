import java.util.*;
class SwapFunction{
    public static void Swap(int num1, int num2){
        int temp;
        temp = num1;
        num1= num2;
        num2= temp;
        System.out.println("num1:"+num1);
        System.out.println("num2:"+num2);
        
       }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 =  sc.nextInt();
        System.out.println("Enter a number:");
        int num2 =  sc.nextInt();
        
        Swap(num1,num2);
        sc.close();
        
    }  
}