import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter n1: ");
        int n1 = sc.nextInt();
        System.out.println("enter n2: ");
        int n2 = sc.nextInt();
        System.out.println("enter operator(+,-,*,/): ");
        char op = sc.next().charAt(0);
        int res;
        switch(op) {
            case '+' :
                res = n1+n2;
                System.out.println(res);
                break;
            case '-' :
                res = n1-n2;
                System.out.println(res);
                break;
            case '*' :
                res = n1*n2;
                System.out.println(res);
                break;
            case '/' :
                res = n1/n2;
                System.out.println(res);
                break;
            default:
                System.out.println("incorrect op");
        }
        sc.close();
    }
  
}


