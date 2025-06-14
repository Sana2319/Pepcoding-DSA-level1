import java.util.*;
public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        
        if(marks >= 90) {
             System.out.println("Excellent");
        }
        else if(marks < 50 || marks < 90) {
             System.out.println("Average");
        }
        else {
             System.out.println("Improve");
        }
        sc.close();
    }
}

