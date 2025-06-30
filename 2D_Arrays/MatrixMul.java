import java.util.*;
public class MatrixMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter rows of 1st matrix: ");
        int a1 = sc.nextInt();
        System.out.println("enter cols of 1st matrix: ");
        int b1 = sc.nextInt();
        int[][] one = new int[a1][b1];
        for(int i=0; i<a1; i++) {
            for(int j=0; j<b1; j++) {
                one[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter rows of 2nd matrix: ");
        int a2 = sc.nextInt();
        System.out.println("enter cols of 2nd matrix: ");
        int b2 = sc.nextInt();
        int[][] two = new int[a2][b2];
        for(int i=0; i<a2; i++) {
            for(int j=0; j<b2; j++) {
                two[i][j] = sc.nextInt();
            }
        }
        sc.close();  
        
        if(b1 != a2) {
            System.out.println("invalid input");
            return;
        }
        int[][] prod = new int[a1][b2];
        for(int i=0; i<a1; i++) {
            for(int j=0; j<b2; j++) {
                for(int k=0; k<b1; k++) {
                    prod[i][j] += one[i][k] * two[k][j];
                }
            }
        } 
        System.out.println("The 2D array is: ");
        for(int i=0; i<a1; i++) {
            for(int j=0; j<b2; j++) {
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        } 
    }
}
