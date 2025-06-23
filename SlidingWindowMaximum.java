// Given an array arr[] and a window size k, for each window of size k, find the maximum element
// NGE nikalenge phir 2 pointer approach apply krenge where j refers to the index of current max of the window
import java.util.*;
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of arr: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements of the arr: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value of k: ");
        int k = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        int[] NGE = new int[n]; //nge array of size --> arr.length
        st.push(n-1);
        NGE[n-1] = arr.length; //NGE me last element ka index -1 lete the but isme arr k length jitna lenge ya phir infinity qh ki sliding window k bahar jane tk check krna h mtlb out of bound hone tk
        for(int i=n-2; i>=0; i--) {
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]) {
                st.pop();
            }
            if(st.isEmpty()) {
                NGE[i] = n;
            }
            else {
                NGE[i] = st.peek();
            }
            st.push(i);
        }
        int j = 0;
        for(int i=0; i<=n-k; i++) {  //for k window size it can run onlyupto n-k length
            //to find maximum of window starting at i
            if(j < i) {  //If j < i, that means our current max index j has fallen out of the window, because the window starts from index i.            
                j = i;   //So, we must reset j = i to start checking from the beginning of the new window.
            }
            while(NGE[j] < i+k) {  //NGE[j] < i + k → means the next greater element of nums[j] is still inside the current window, (i+k) refers to end of current window
                j = NGE[j];   //We can jump to it and update j = NGE[j]
            }
            System.out.println(arr[j]);
        }
        sc.close();
    }
}
