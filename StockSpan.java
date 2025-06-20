// span: next greater element to the left
// 1.greater element aane pr pichhle chhote elements ko pop krayenge  2.ans store krenge agr pichhla sara pop ho gya mtlb stack empty ho gya 
// tb value index+1 hoga nhi to jo last value h stack ka usko substract krenge present index se mtlb i-st.peek()  3.next element push kr denge
import java.util.*;;
public class StockSpan {
    public static int[] solve(int[] arr) {
        int[] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] = 1;
        for(int i=1; i<arr.length; i++) {
            while(st.size() > 0 && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            if(st.size()==0) {
                span[i] = i + 1;
            }
            else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.of days: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter stock prices: ");
        for(int i=0; i<n; i++) {
            prices[i] = sc.nextInt();
        }
        int[] result = solve(prices);
        System.out.println("Stock spans are:");
        for (int span : result) {
            System.out.print(span + " ");
        }

        sc.close();
    }
}
