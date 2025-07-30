import java.util.*;

public class Highestfreq {
    public static void main(String[] args) { 
        Scanner sc =  new Scanner((System.in));
        System.out.println("enter a string: ");
        String str = sc.nextLine();
        sc.close();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt((i));
            if(hm.containsKey((ch))) {
                int of = hm.get(ch);  // old freq
                int nf = of + 1;  // new freq
                hm.put(ch, nf);
            }
            else {
                hm.put(ch, 1);
            }
        }
        char mfc = str.charAt(0);  // max freq char
        for(Character key : hm.keySet()) {
            if(hm.get(key) > hm.get(mfc)) {
                mfc = key;
            }
        }
        System.out.println(mfc);;
    }
}
