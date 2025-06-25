import java.util.*;
public class PostfixExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("enter the expression: ");
        String exp = sc.nextLine();
        sc.close();
        Stack<Integer> valSt = new Stack<>();
        Stack<String> is = new Stack<>();
        Stack<String> ps = new Stack<>();  
        for(int i=0; i<exp.length(); i++) {
            char ch  = exp.charAt(i);
            
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int val2 = valSt.pop();
                int val1 = valSt.pop();
                int val = operation(val1, val2, ch);
                valSt.push(val);

                String i_val2 = is.pop();
                String i_val1 = is.pop();
                String i_val = "(" + i_val1 + ch + i_val2 + ")";
                is.push(i_val);

                String p_val2 = ps.pop();
                String p_val1 = ps.pop();
                String p_val = ch + p_val1 + p_val2;
                ps.push(p_val);
            }
            else {
                valSt.push(ch - '0');
                is.push(ch + "");
                ps.push(ch + "");
            }
        }
        System.out.println(valSt.pop());
        System.out.println(is.pop());
        System.out.println(ps.pop());
    }
    public static int operation(int val1, int val2, char op) {
        if(op == '+') return val1 + val2;
        else if(op == '-') return val1 - val2;
        else if(op == '*') return val1 * val2;
        else if(op == '/') return val1 / val2;
        else return 0;
    }
}
