import java.util.*;
public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch =str.charAt(i);
            if(ch == ')') {
                if(st.peek() == '(') {
                    System.out.println("duplicacy present");
                    sc.close();
                    return;
                }
                else {
                    while(st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            }
            else {
                st.push(ch);
            }
        }
        System.out.println("no duplicacy");
        sc.close();
    }
}
