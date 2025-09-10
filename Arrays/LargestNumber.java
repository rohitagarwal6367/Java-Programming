public class LargestNumber {
    
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // for -infinity
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is: "+smallest);
        return largest; // Return the largest value found
    }
    
    public static void main(String args[]) {
        int numbers[] = {1, 2, 3, 4, 5, 8, 6, 7};
        
        System.out.println("Largest value: " + getLargest(numbers)); // Fixed typo
    }
}
