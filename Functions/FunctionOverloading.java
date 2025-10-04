// usin by Parameter

public class FunctionOverloading{
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    
    public static  void main(String arg[]){
        System.out.println(sum(3,5));
        System.out.println(sum(3,5,7));
       
    }
}

 
//  Using by DataType
 
// public class FunctionOverloading{
//     public static int sum(int a, int b){
//         return a+b;
//     }
//     public static float sum(float a, float b,float c){
//         return a+b+c;
//     }
    
//     public static  void main(String arg[]){
//         System.out.println(sum(3,5));
//         System.out.println(sum(3,5,7));
       
//     }
// }