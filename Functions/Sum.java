import java.util.*;

public class Sum {
    public static int calculateSum(int num1, int num2) {  // parameter or formal parameter
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int a = sc.nextInt();

        System.out.println("enter second number: ");
        int b = sc.nextInt();

        int result = calculateSum(a, b);  // arguments or actual parameter
        System.out.println("Sum is: " + result);
        sc.close();
    }
}





// import java.util.*;
// class Main{
//     public static int Sum(int num1, int num2){
//         int sum = num1+num2;
//         System.out.println("Sum is:"+sum);
//         return sum;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int num1 =  sc.nextInt();
//         System.out.println("Enter a number:");
//         int num2 =  sc.nextInt();
        
//         Sum(num1,num2);
        
//     }  
// }