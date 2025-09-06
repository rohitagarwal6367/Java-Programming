 import java.util.*;
 public class printnumber{
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter your range:");
         int range = sc.nextInt();
         int sum = 0;
         System.out.println("the value is:");
         int i = 1;
         while(i<=range){
              
             System.out.println(i+" ");
             sum+=i;
             i++;
             
         }
         System.out.println("sum is:"+sum);

         sc.close();
     }
 }