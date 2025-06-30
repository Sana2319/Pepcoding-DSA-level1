// Display the contents of 2D arrays
import java.util.*;
public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows: ");
        int a = sc.nextInt();
        System.out.println("enter no. of cols: ");
        int b = sc.nextInt();

        int[][] arr = new int[a][b];
        for(int i=0; i<a; i++) {
            for(int j=0; j<b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
