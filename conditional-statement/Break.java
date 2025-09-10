import java.util.*;
public class Break{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       do{
           System.out.print("Enter your number:");
           int n = sc.nextInt();
           
           if(n%10 == 0){
               break;  // it will terminate the loop
           }
           System.out.println(n);
       }while(true);

       sc.close();
    }
}
