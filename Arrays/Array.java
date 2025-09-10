import java.util.*;
public class Array{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        
        int marks[] = new int[100]; // empty array with size of 100
        
        System.out.println("Enter marks:");
         marks[0] =sc.nextInt();
         marks[1] =sc.nextInt();
         marks[2] =sc.nextInt();
         
         System.out.println("phy:"+marks[0]);
         System.out.println("chem:"+marks[1]);
         System.out.println("maths:"+marks[2]);
         
         marks[2]=100;  // update the array value at index 2
         //marks[2]= marks[2]+1; // also   we use this for update the value
         System.out.println("maths:"+marks[2]);

        //  int percentage = (marks[0]+marks[1]+marks[2])/3;    // this is use for percentage
        //  System.out.println("precentage ="+percentage+"%");

         sc.close();
    }
}
