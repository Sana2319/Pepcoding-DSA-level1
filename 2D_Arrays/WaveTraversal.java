import java.util.*;
public class WaveTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int a = sc.nextInt();
        System.out.println("Enter cols: ");
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        for(int i=0; i<a; i++) {
            for(int j=0; j<b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Wave Traversal Output:");
        for(int j=0; j<b; j++) {   // j bcoz we are going col wise
            if(j%2 == 0 ) {
                // top to bottom
                for(int i=0; i<a; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else {
                //bottom to top
                for(int i=a-1; i>=0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
