import java.util.*;
public class SpiralTraversal {
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

        int str = 0;
        int er = a-1;
        int stc = 0;
        int ec = b-1;
        System.out.println("Output of Spiral Traversal: ");
        while (str <= er && stc <= ec) {
            for(int i=str; i<=er; i++) {
                System.out.println(arr[i][stc]);
            }
            stc++;

            if (str<=er) {
                for(int i=stc; i<=ec; i++) {
                System.out.println(arr[er][i]);
            }
            er--;
            }

            if(stc<=ec) {
                for(int i=er; i>=str; i--) {
                System.out.println(arr[i][ec]);
            }
            ec--;
            }
            
            if (str<=er) {
                for(int i=ec; i>=stc; i--) {
                System.out.println(arr[str][i]);
            }
            str++;
            }
            
        }
    }
}
