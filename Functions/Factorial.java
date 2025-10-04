import java.util.*;
public class Factorial{
    public static int calculateFactorial(int n){
        int fact = 1;
        for(int i = 1; i<=n;i++){
            fact= fact*i;
        }
        System.out.println("Factorial is :"+fact);
        return fact;
     }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        calculateFactorial(n);
        sc.close();
    }
}