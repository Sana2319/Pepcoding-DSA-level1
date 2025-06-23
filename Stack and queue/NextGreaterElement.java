// loop ulta chalayenge n-1 se push krenge --- 1.last element k aage kchh nhi h so NGE -1 hoga  2.pop krenge until koi greater element na aa jaye
// ya phir stack empty then -1  3.ans print krayenge greaterElement or -1  4.push krenge next element
import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] NGE = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        NGE[n-1] = -1;
        for(int i=n-2; i>=0; i--) {
            while(!st.isEmpty() && arr[i]>st.peek()) {
                st.pop();
            }
            if(st.isEmpty()) {
                NGE[i] = -1;
            }
            else{
                NGE[i] = st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println("Next greater element is: ");
        for(int i=0; i<n; i++) {
            System.out.println(arr[i] + "--->" + NGE[i]);
        }
        sc.close();
    }
}
