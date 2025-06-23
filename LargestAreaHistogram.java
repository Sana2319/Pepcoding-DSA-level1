import java.util.Scanner;
import java.util.Stack;

public class LargestAreaHistogram {
    public static int LargestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> st = new Stack<>();
        //left(Next Smaller Element to the left)
        for(int i=0; i<n; i++) {
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]) { //using <= to manage duplicates like same no.s 1 1 or 4 4 
                st.pop();
            }
            if(st.isEmpty()) {
                left[i] = -1;
            }
            else {
                left[i] = st.peek();
            }
            st.push(i);
        }
        st.clear(); //clearing stack to reuse
        //right (Next Smaller Element to the right)
        for(int i=n-1; i>=0; i--) {
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]) {
                st.pop();
            }
            if(st.isEmpty()) {
                right[i] = n; //last index+1
            }
            else {
                right[i] = st.peek();
            }
            st.push(i);
        }

        int maxArea = 0;
        for(int i=0; i<n; i++) {
            int width = right[i]-left[i]-1;
            int area = width * heights[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of bars: ");
        int n = sc.nextInt();
        int[] heights = new int[n];
        System.out.println("Enter bar heights:");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        int area = LargestRectangleArea(heights);
        System.out.println("Largest rectangle area is: " + area);
        sc.close();
    }
}
