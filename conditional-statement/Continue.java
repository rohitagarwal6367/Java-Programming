import java.util.*;
public class Continue{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
       for(int i=1; i<=n;i++){
           if(i == 6){
               continue;  // it will skip the current iteration
           }
           System.out.print(i);
       }

       sc.close();
    }
}