import java.util.*;
public class CommonElements { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. of elements: ");
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        System.out.println("enter the elements: ");
        for(int i=0; i<n1; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.println("enter no. of elements: ");
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        System.out.println("enter the elements: ");
        for(int i=0; i<n2; i++) {
            a2[i] = sc.nextInt();
        }
        sc.close();

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : a1) {
            if(map.containsKey(val)) {
                int of = map.get(val);
                int nf = of + 1;
                map.put(val, nf);
            }
            else {
                map.put(val, 1);
            }
        }
        System.out.println("common elements are: ");
        for(int val : a2) {
            if(map.containsKey(val)) {
                System.out.println(val);
                map.remove(val);  // Prevents duplicates from being printed in the output.
            }
        }
    }
}
