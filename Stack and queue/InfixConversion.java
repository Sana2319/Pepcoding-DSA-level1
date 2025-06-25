import java.util.*;
public class InfixConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the expression: ");
        String exp = sc.nextLine();
        sc.close();
        Stack<String> post = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Character> op = new Stack<>();  //operator
        for(int i=0; i<exp.length(); i++) {
            char ch = exp.charAt(i);
            if(ch == '(') {
                op.push(ch);
            }
            else if((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                post.push(ch + "");
                pre.push(ch + "");
            }
            else if(ch == ')') {
                while(op.peek() != '(') {
                    char ops = op.pop();

                    String post_v2 = post.pop();
                    String post_v1 = post.pop();
                    String post_v = post_v1 + post_v2 + ops;
                    post.push(post_v);

                    String pre_v2 = pre.pop();
                    String pre_v1 = pre.pop();
                    String pre_v = ops + pre_v1 + pre_v2;
                    pre.push(pre_v);
                }
                op.pop();
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while(!op.isEmpty() && op.peek() != '(' && precedence(ch) <= precedence(op.peek())) {
                    char ops = op.pop();

                    String post_v2 = post.pop();
                    String post_v1 = post.pop();
                    String post_v = post_v1 + post_v2 + ops;
                    post.push(post_v);

                    String pre_v2 = pre.pop();
                    String pre_v1 = pre.pop();
                    String pre_v = ops + pre_v1 + pre_v2;
                    pre.push(pre_v);
                }
                op.push(ch);
            }
        }
        while(!op.isEmpty()) {
            char ops = op.pop();

            String post_v2 = post.pop();
            String post_v1 = post.pop();
            String post_v = post_v1 + post_v2 + ops;
            post.push(post_v);

            String pre_v2 = pre.pop();
            String pre_v1 = pre.pop();
            String pre_v = ops + pre_v1 + pre_v2;
            pre.push(pre_v);
        }
        System.out.println(post.pop());
        System.out.println(pre.pop());
    }
    public static int precedence(char op) {
        if(op == '+' || op == '-') return 1;
        if(op == '/' || op == '*') return 2;
        return 0;
    }
}
