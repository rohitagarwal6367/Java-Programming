import java.util.*;

public class SumType2 {
    public static void calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("sum:"+sum);
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("enter second number: ");
        int num2 = sc.nextInt();

       calculateSum(num1,num2);
        sc.close();
    }
}

