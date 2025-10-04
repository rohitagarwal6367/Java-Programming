import java.util.*;
public class binomial{
    public static int calFactorial(int n){
        int fact = 1;
        for(int i = 1; i<=n;i++){
            fact= fact*i;
        }
       
        return fact;
     }
     
     public static int binCoeff(int n, int r){
         int fact_n = calFactorial(n);
         int fact_r = calFactorial(r);
         int fact_nmr = calFactorial(n-r);
         
         int binCoeff = fact_n/(fact_r*fact_nmr);
         return binCoeff;
     }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        
         System.out.println("Enter value of r:");
        int r = sc.nextInt();
        
        System.out.println("cofficent:"+(binCoeff(n,r)));
        
        sc.close();
    }
} 


// without giving any input


// public class binomial{
//     public static int calFactorial(int n){
//         int fact = 1;
//         for(int i = 1; i<=n;i++){
//             fact= fact*i;
//         }
       
//         return fact;
//      }
     
//      public static int binCoeff(int n, int r){
//          int fact_n = calFactorial(n);
//          int fact_r = calFactorial(r);
//          int fact_nmr = calFactorial(n-r);
         
//          int binCoeff = fact_n/(fact_r*fact_nmr);
//          return binCoeff;
//      }
    
//     public static void main(String args[]){
        
//         System.out.println("cofficent:"+(binCoeff(9,4)));
        
//     }
// } 