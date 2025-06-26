import java.util.*;
public class CelebrityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the size of matrix: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements: ");
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int result = findCelebrity(arr);
        if (result == -1) {
            System.out.println("none");
        } else {
            System.out.println("Celebrity is: " + result);
        }
    }
    public static int findCelebrity(int[][] arr) {
        //if celebrity is present print their index(not position)

        // Step 1: Push everyone to the stack
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            st.push(i);
        }
        // Step 2: Find potential celebrity
        while(st.size()>=2) {
            int a =st.pop();
            int b = st.pop();

            if(arr[a][b] == 1) {
                // a knows b => a cannot be celebrity
                st.push(b);
            }
            else {
                // a does not know b => b cannot be celebrity
                st.push(a);
            }
        }
        // Step 3: Verify the last person
        if(st.isEmpty()) return -1;
        int candidate = st.pop();
        for(int i=0; i<arr.length; i++) {
            if(i != candidate) {
                if(arr[i][candidate] == 0 || arr[candidate][i] == 1) {
                    return -1;
                }
            }
        }
        return candidate;
    }   
}
