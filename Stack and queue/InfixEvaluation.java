import java.util.*;
public class InfixEvaluation {
    public static int precedence(char op) {
        if(op == '+' || op == '-') return 1;
        if(op == '/' || op == '*') return 2;
        return 0;
    }
    public static int performOp(int val1, char op, int val2) {
        if(op == '+') return val1 + val2;
        if(op == '-') return val1 - val2;
        if(op == '*') return val1 * val2;
        if(op == '/') return val1 / val2;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression: ");
        String exp = sc.nextLine();
        sc.close();
        Stack<Character> operatorSt = new Stack<>();
        Stack<Integer> operandSt = new Stack<>();
        for(int i=0; i<exp.length(); i++) {
            //This method only works for single-digit numbers
            char ch = exp.charAt(i);
            // if(ch >= '0' && ch <= '9') {
            //     operandSt.push(ch - '0');  //ch - '0' converts that character into an integer.
            // }

            //for multiple digits like 23, 42
            if(Character.isWhitespace(ch)) {  //skips spaces like " " between 2 + 3
                continue;
            }
            if(Character.isDigit(ch)) {  //Character is Wrapper class for char
                int num = 0;
                while(i < exp.length() && Character.isDigit(exp.charAt(i))) {
                    num = num * 10 + (exp.charAt(i) - '0');
                    i++;
                }
                i--; // go back one step, because the outer loop will increase it
                operandSt.push(num);
            }
            else if(ch == '(') {
                operatorSt.push(ch);  
            }
            else if(ch == ')') {
                while(operatorSt.peek() != '(') {
                    int val2 = operandSt.pop();
                    int val1 = operandSt.pop();
                    char op = operatorSt.pop();
                    operandSt.push(performOp(val1, op, val2));
                }
                operatorSt.pop(); // pop '('
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while(!operatorSt.isEmpty() && operatorSt.peek() != '(' &&
                      precedence(operatorSt.peek()) >= precedence(ch)) {
                    int val2 = operandSt.pop();
                    int val1 = operandSt.pop();
                    char op = operatorSt.pop();
                    operandSt.push(performOp(val1, op, val2));
                }
                operatorSt.push(ch);
            }
        }
        //to perform remaining operation in the stack after traversal
        while(!operatorSt.isEmpty()) {
            int val2 = operandSt.pop();
            int val1 = operandSt.pop();
            char op = operatorSt.pop();
            int res = performOp(val1, op, val2);
            operandSt.push(res);
        }
        System.out.println(operandSt.peek());
    }
}
