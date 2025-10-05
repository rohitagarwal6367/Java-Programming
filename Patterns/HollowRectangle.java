
public class HollowRectangle {

    public static void hollow_rectangle(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) {    // outer loop
            for (int j = 1; j <= totCols; j++) {   // inner loop
                // cell (i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    //boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        hollow_rectangle(4, 5);
    }
}
