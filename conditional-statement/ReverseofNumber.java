import java.util.*;
public class ReverseofNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enterr a number:");
        int num =  sc.nextInt();
        
        while(num>0){
            int lastdigit = num%10;
            System.out.print(lastdigit);
            num= num/10;
        }

        sc.close();
    }
}