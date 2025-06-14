import java.util.*;

public class Loops {
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              // int n = sc.nextInt();
              // for(int i=0; i<=n; i++) {
              // System.out.println(i);
              // }
              // String name = sc.nextLine();
              // System.out.println("Dear " + name + ". Thanks for connecting!");

              // For both String and Int input
              // int n = Integer.parseInt(sc.nextLine());
              // String name = sc.nextLine();
              // System.out.println("Dear " + name + ".Here is the counting ");
              // for(int i=0; i<=n; i++) {
              // System.out.println(i);
              // }

              // prime no
              // System.out.println("Enter no: ");
              // int n = sc.nextInt(); 
              // if(n <= 1) {
              // System.out.println("prime");
              // }
              // for(int i=2; i<=Math.sqrt(n); i++) {
              // if(n%i == 0) {
              // System.out.println("Not prime");
              // break;
              // }
              // else {
              // System.out.println("Prime");
              // }
              // }
              // OR the above doesnt handle edge cases like square(eg. 9)
              // System.out.println("Enter no: ");
              // int n = sc.nextInt();
              // if(n <= 1) {
              // System.out.println("prime");
              // }
              // boolean isPrime = true;
              // for(int i=2; i<=Math.sqrt(n); i++) {
              // if(n%i == 0) {
              // isPrime = false;
              // break;
              // }
              // }
              // if(isPrime == true) {
              // System.out.println("Prime");
              // }
              // else {
              // System.out.println("Not Prime");
              // }

              // print all prime till n range

              // System.out.println("Enter low: ");
              // int low = sc.nextInt();
              // System.out.println("Enter high: ");
              // int high = sc.nextInt();
              // for(int n=low ;n<=high; n++) {
              // int count = 0;
              // for(int i=2; i<=Math.sqrt(n); i++) {
              // if(n%i == 0) {
              // count++;
              // break;
              // }
              // }
              // if(count == 0) {
              // System.out.println(n);
              // }
              // }

              // Fibonacci no 0 1 1 2 3 5 8 13 21 34 55 (add last 2 no.)
              // System.out.println("Enter n: ");
              // int n = sc.nextInt();
              // int a = 0;
              // int b = 1;
              // for(int i=0; i<=n; i++) {
              // System.out.println(a);
              // int c = a + b;
              // a=b;
              // b=c;
              // }

              // Count digits in a no.
              // System.out.println("Enter n: ");
              // int n = sc.nextInt();
              // int count = 0;
              // while(n != 0) {
              // n = n/10;
              // count++;
              // }
              // System.out.println(count);

              // Digits of a no. from right to left
              // System.out.println("Enter n: ");
              // int n = sc.nextInt();
              // while(n != 0) {
              // int rev = n%10;
              // System.out.println(rev);
              // n = n/10;
              // }

              // Digits of a no. from left to right
              // System.out.println("Enter n: ");
              // int n = sc.nextInt();
              // int count = 0;
              // int temp = n;
              // while(temp != 0) {
              // temp = temp/10;
              // count++;
              // }
              // int divisor = (int)Math.pow(10, count-1);
              // while(divisor != 0) {
              // int q = n/divisor;
              // System.out.println(q);
              // n = n%divisor;
              // divisor = divisor/10;
              // }

              // Inverse of a number
              // System.out.println("Enter n: ");
              // int n = sc.nextInt();
              // int ans = 0;
              // int pos = 1;
              // while(n !=0) {
              // int digit = n%10;
              // ans = ans + pos*(int)Math.pow(10, digit-1);
              // pos++;
              // n = n/10;
              // }
              // System.out.println(ans);

              // Rotate a no (k=no.of rotation)
              // System.out.println("Enter n: ");
              // int n = sc.nextInt();
              // System.out.println("Enter k: ");
              // int k = sc.nextInt();
              // int temp = n;
              // int nod = 0; //nod= no. of digits
              // while(temp != 0) {
              // temp = temp/10;
              // nod++;
              // }

              // if(k < 0) {
              // k = nod + k;
              // }

              // int q = n/(int)Math.pow(10, k);
              // int rem = n%(int)Math.pow(10, k);
              // n = q + rem*(int)Math.pow(10, nod-k);
              // System.out.println(n);

              // Calculate gcd and lcm
              // System.out.println("Enter n1: ");
              // int n1 = sc.nextInt();
              // System.out.println("Enter n2: ");
              // int n2 = sc.nextInt();
              // int orig_n1 = n1;
              // int orig_n2 = n2;
              // while(n1 % n2 != 0) {
              // int rem = n1 % n2;
              // n1 = n2;
              // n2 = rem;
              // }
              // int gcd = n2;
              // System.out.println("GCD is " + gcd);
              // int lcm = (orig_n1 * orig_n2)/gcd; // gcd*lcm = n1*n2 we used orig_n1 and
              // orig_n2 bcz n1 and n2 got altered during gcd calculation
              // System.out.println("LCM is " + lcm);

              // Prime factorisation
              // System.out.println("Enter n: ");
              // int n = sc.nextInt();

              // for(int i=2; i<=n; i++) {
              // while(n % i == 0) {
              // n = n / i;
              // System.out.println(i);
              // }
              // }

              // optimisation of prime factorisation
              // System.out.println("Enter n: ");
              // int n = sc.nextInt();

              // for(int i=2; i<=Math.sqrt(n); i++) {
              // while(n % i == 0) {
              // n = n / i;
              // System.out.println(i);
              // }
              // }
              // if(n != 1) {
              // System.out.println(n); // qh ki root n k baad jisse v divide hoga wo khud no.
              // hi hoga
              // }

              // Pythagorean triplets
              // System.out.println("Enter a: ");
              // int a = sc.nextInt();
              // System.out.println("Enter b: ");
              // int b = sc.nextInt();
              // System.out.println("Enter c: ");
              // int c = sc.nextInt();
              // int h;
              // if(a>=b && a>=c) {
              // System.out.println("a is greatest");
              // h = a;
              // }
              // else if(b>=a && b>=c) {
              // System.out.println("b is greatest");
              // h = b;
              // }
              // else {
              // System.out.println("c is greatest");
              // h = c;
              // }
              // if(h*h == b*b + c*c || h*h == a*a + c*c || h*h == a*a + b*b) {
              // System.out.println("Pythagorean triplets");
              // }

              // optimised
              // System.out.println("Enter a: ");
              // int a = sc.nextInt();
              // System.out.println("Enter b: ");
              // int b = sc.nextInt();
              // System.out.println("Enter c: ");
              // int c = sc.nextInt();

              // int max = a;
              // if(b >= max) {
              // max = b;
              // }
              // else {
              // max = c;
              // }
              // if(max == a) {
              // System.out.println("Pythagorean triplet = " + (b*b + c*c));
              // }

              // else if(max == b) {
              // System.out.println("Pythagorean triplet = " + (a*a + c*c));
              // }

              // else if (max == c) {
              // System.out.println("Pythagorean triplet = " + (b*b + a*a));
              // }

              // //Benjamin bulbs (34)
              // System.out.println("Enter n");
              // int n = sc.nextInt();
              // int sqr = (int)Math.sqrt(n);
              // if(sqr*sqr == n) {
              // System.out.println("perfect sq hence benjamin bulbs");
              // for(int i=1; i<Math.sqrt(n); i++) {
              // System.out.println(i*i);
              // }
              // }
              // else {
              // System.out.println(" not a perfect sq hence not benjamin bulbs");
              // }

              // // Pattern 1 (35)
              // *
              // * *
              // * * *
              // * * * *
              // System.out.println("Enter n");
              // int n = sc.nextInt();
              // for(int i=1; i<=n; i++) {
              // for(int j=1; j<=i; j++) {
              // System.out.print("* \t");
              // }
              // System.out.println();
              // }

              // Pattern 2 (37)
              // * * *
              // * *
              // *
              // System.out.println("Enter n");
              // int n = sc.nextInt();
              // for(int i=1; i<=n; i++) {
              // for(int j=n; j>=i; j--) {
              // System.out.print("* \t");
              // }
              // System.out.println();
              // }

              // Pattern 3 (39)
              //   *
              //  **
              // ***
              // System.out.println("Enter n");
              // int n = sc.nextInt();
              // int sp = n-1;
              // int st = 1;
              // for(int i=1; i<=n; i++) {
              // //System.out.println(sp + "," + st);
              // for(int j=1; j<=sp; j++) {
              // System.out.print(" \t");
              // }
              // for(int j=1; j<=st; j++) {
              // System.out.print("* \t");
              // }
              // sp--;
              // st++;
              // System.out.println();
              // }

              // //Pattern 4 (41)
              // * * *
              //   * *
              //     *
              // System.out.println("Enter n");
              // int n = sc.nextInt();
              // int sp = 0;
              // int st = n;
              // for(int i=1; i<=n; i++) {
              // //System.out.println(sp + "," + st);
              // for(int j=1; j<=sp; j++) {
              // System.out.print(" \t");
              // }
              // for(int j=1; j<=st; j++) {
              // System.out.print("* \t");
              // }
              // sp++;
              // st--;
              // System.out.println();
              // }

              // Pattern 5 (43)
              //     *
              //   * * *
              // * * * * *
              //   * * *
              //     *
              // System.out.println("Enter n");
              // int n = sc.nextInt();
              // int sp = n/2;
              // int st = 1;
              // for(int i=1; i<=n; i++) {
              // //System.out.println(sp + "," + st);
              // for(int j=1; j<=sp; j++) {
              // System.out.print(" \t");
              // }
              // for(int j=1; j<=st; j++) {
              // System.out.print("* \t");
              // }
              // if(i <= n/2) {
              // sp--;
              // st += 2;
              // }
              // else{
              // sp++;
              // st -= 2;
              // }
              // System.out.println();
              // }

              // pattern 6 (45)
              // *** ***
              // **   **
              // *     *
              // **   **
              // *** ***
              // System.out.println("Enter n (n needs to be odd): ");
              // int n = sc.nextInt();
              // int sp =1;
              // int st = n/2 + 1;
              // for(int i=1; i<=n; i++) {

              // // System.out.println(st + "," + sp + "," + st);
              // for(int j=1; j<=st; j++) {
              // System.out.print("* \t");
              // }
              // for(int j=1; j<=sp; j++) {
              // System.out.print(" \t");
              // }
              // for(int j=1; j<=st; j++) {
              // System.out.print("* \t");
              // }
              // if(i <= n/2) {
              // sp += 2;
              // st--;
              // }
              // else {
              // sp -= 2;
              // st++;
              // }
              // System.out.println();
              // }

              // // Pattern 7(diagonal) (47)
              // // *
              // //   *
              // //     *
              // //       *
              // //         *
              // System.out.println("Enter n (n needs to be odd): ");
              // int n = sc.nextInt();

              // for(int i=1; i<=n; i++) {

              // for(int j=1; j<=n; j++) {
              // if(i == j) {
              // System.out.print("*\t");
              // }
              // else {
              // System.out.print("\t");
              // }
              // }

              // System.out.println();
              // }

              // // Pattern 8(diagonal) (49)
              // //         *
              // //       *
              // //     *
              // //   *
              // // *
              // System.out.println("Enter n (n needs to be odd): ");
              // int n = sc.nextInt();

              // for(int i=1; i<=n; i++) {

              // for(int j=1; j<=n; j++) {
              // if(i+j == n+1) {
              // System.out.print("*\t");
              // }
              // else {
              // System.out.print("\t");
              // }
              // }

              // System.out.println();
              // }

              // // Pattern 9( both diagonal) (51)
              // // *       *
              // //   *   *
              // //     *
              // //   *   *
              // // *       *
              // System.out.println("Enter n (n needs to be odd): ");
              // int n = sc.nextInt();

              // for(int i=1; i<=n; i++) {

              // for(int j=1; j<=n; j++) {
              // if(i == j || i+j == n+1) {
              // System.out.print("*\t");
              // }
              // else {
              // System.out.print("\t");
              // }
              // }

              // System.out.println();
              // }

              // // Pattern 10 (53)
              // //     *
              // //   *    *
              // // *        *
              // //   *    *
              // //      *
              // System.out.println("Enter n (n needs to be odd): ");
              // int n = sc.nextInt();
              // int OS = n/2;
              // int IS = -1;

              // for(int i=1; i<=n; i++) {
              // for(int j=1; j<=OS; j++) {
              // System.out.print(" \t");
              // }

              // System.out.print("* \t");

              // for(int j=1; j<=IS; j++) {
              // System.out.print(" \t");
              // }

              // if(i>1 && i<n) {
              // System.out.print("* \t");
              // }

              // if(i <= n/2) {
              // OS--;
              // IS += 2;
              // }
              // else{
              // OS++;
              // IS -= 2;
              // }

              // System.out.println();
              // }

              // // Pattern 11 (55)
              // 1
              // 2 3
              // 4 5 6
              // 7 8 9 10
              // 11 12 13 14 15
              // System.out.println("Enter n: ");
              // int n = sc.nextInt();
              // int val = 1;
              // for(int i=1; i<=n; i++) {
              // for(int j=1; j<=i; j++) {
              // System.out.print(val + "\t");
              // val++;
              // }
              // System.out.println();
              // }

              // // Pattern 12 (57)
              // 0
              // 1 1
              // 2 3 5
              // 8 13 21 34
              // 55 89 144 233 377
              // System.out.println("Enter n: ");
              // int n = sc.nextInt();
              // int val1 = 0;
              // int val2 = 1;
              // for(int i=1; i<=n; i++) {
              // for(int j=1; j<=i; j++) {
              // System.out.print(val1 + "\t");
              // int val = val1 + val2;
              // val1 = val2;
              // val2 = val;
              // }
              // System.out.println();
              // }

              // // Pattern 12 (59)
              // // 1
              // // 1 1
              // // 1 2 1
              // // 1 3 3 1
              // // 1 4 6 4 1
              // // 1 5 10 10 5 1
              // System.out.println("Enter n: ");
              // int n = sc.nextInt();
              // for(int i=0; i<n; i++) {
              // int iCj = 1;
              // for(int j=0; j<=i; j++) {
              // System.out.print(iCj + "\t");
              // int iCjp1 = iCj*(i-j)/(j+1);
              // iCj = iCjp1;
              // }
              // System.out.println();
              // }

              // // Pattern 13 (61)
              // x * 1 = x
              // x * 2 = 2x
              // x * 3 = 3x
              // ...
              // System.out.println("Enter n: ");
              // int x = sc.nextInt();
              // for(int i=1; i<=10; i++) {
              // int val = x * i;
              // System.out.println(x + " * " + i + " = " + val);
              // }

              // // Pattern 15 (63)
              // //     1
              // //   2 3 2
              // // 3 4 5 4 3
              // //   2 3 2
              // //     1
              // System.out.println("Enter n");
              // int n = sc.nextInt();
              // int sp = n/2;
              // int st = 1;
              // int val = 1;
              // for(int i=1; i<=n; i++) {
              // //System.out.println(sp + "," + st);
              // for(int j=1; j<=sp; j++) {
              // System.out.print(" \t");
              // }
              // int cval = val;
              // for(int j=1; j<=st; j++) {
              // System.out.print(cval + "\t");
              // if(j <= st/2) {
              // cval++;
              // }
              // else {
              // cval--;
              // }
              // }
              // if(i <= n/2) {
              // sp--;
              // st += 2;
              // val++;
              // }
              // else{
              // sp++;
              // st -= 2;
              // val--;
              // }
              // System.out.println();
              // }

              // // Pattern 16 (65)
              // 1           1
              // 1 2       2 1
              // 1 2 3   3 2 1
              // 1 2 3 4 3 2 1
              // System.out.println("Enter n: ");
              // int n = sc.nextInt();
              // int num = 1;
              // int sp = 2 * n - 3; // or num+1
              // for (int i = 1; i <= n; i++) {
              //        int val = 1;
              //        for (int j = 1; j <= num; j++) {
              //               System.out.print(val + "\t");
              //               val++;
              //        }
              //        for (int j = 1; j <= sp; j++) {
              //               System.out.print(" \t");
              //        }
              //        if(i == n) {
              //               val--;
              //        }
              //        for (int j = 1; j <= num; j++) {
              //               val--;
              //               System.out.print(val + "\t");
              //        }
              //        sp -= 2;
              //        num++;
              //        System.out.println();
              // }

              // // Pattern 17 (67)
              // //       *
              // //       *  *
              // // *  *  *  *  *
              // //       *  *
              // //       *
              // System.out.println("Enter n: ");
              // int n = sc.nextInt();
              // int sp = n/2;
              // int st = 1;
              // for(int i=1; i<=n; i++) {
              //        for(int j=1; j<=sp; j++) {
              //               if(i == n/2+1) {
              //                      System.out.print("*\t");
              //               }
              //               else {
              //                      System.out.print("\t");
              //               }
              //        }
              //        for(int j=1; j<=st; j++) {
              //               System.out.print("*\t");
              //        }
              //        if(i <= n/2) {
              //               st++;
              //        }
              //        else {
              //               st--;
              //        }
              //        System.out.println();
              // }

              // // Pattern 18 (69)
              // System.out.println("Enter n: ");
              // int n = sc.nextInt();
              // int sp = 0;
              // int st = n;
              // for(int i=1; i<=n; i++) {
              //        for(int j=1; j<=sp; j++) {
              //               System.out.print("\t");
              //        }
              //        for(int j=1; j<=st; j++) {
              //               if(i>1 && i<=n/2 && j>1 && j<st) {
              //                      System.out.print("\t");
              //               }
              //               else {
              //                      System.out.print("*\t");
              //               }
              //        }
              //        if(i <= n/2) {
              //               sp++;
              //               st -= 2;
              //        }
              //        else {
              //               sp--;
              //               st += 2;
              //        }
              //        System.out.println();
              // }

              // Pattern 19
              // System.out.println("Enter n: ");
              // int n = sc.nextInt();
              // for(int i=1; i<=n; i++) {
              //        for(int j=1; j<=n; j++) {
              //               if(i==1) {
              //                      if(j==n || j<=n/2+1) {
              //                             System.out.print("*\t");
              //                      }
              //                      else {
              //                             System.out.print("\t");  
              //                      }
              //               }
                            
              //               if(i <= n/2) {
              //                      if(j==n || j<=n/2+1) {
              //                             System.out.print("*\t");
              //                      }
              //                      else {
              //                             System.out.print("\t");   
              //                      }
              //               }
                            
              //               if(i == n/2+1) {
              //                      if(j<=n) {
              //                             System.out.print("*\t");
              //                      }
              //                      else {
              //                             System.out.print("\t");
              //                      }
              //               }
                            
              //               if(i < n/2) {
              //                      if(j==1 || j==n/2+1) {
              //                             System.out.print("*\t");
              //                      }
              //                      else {
              //                             System.out.print("\t");
              //                      }
              //               }
                            
              //               if(i==n) {
              //                      if(j==1 || j>=n/2+1) {
              //                             System.out.print("*\t");
              //                      }
              //                      else {
              //                             System.out.print("\t");
              //                      }
              //               }
              //        }
              //        System.out.println();
              // }

              // // Pattern 20
              System.out.println("enter  : ");
              int n = sc.nextInt();
              for(int i=1; i<=n; i++) {
                     for(int j=1; j<=n; j++) {
                            if(j==1 || j==n) {
                                   System.out.print("*\t");
                            }
                            else if(i>n/2 && (i==j || i+j==n+1)) {
                                   System.out.print("*\t");
                            }
                            else {
                                   System.out.println("\t");
                            }
                     }
                     System.out.println();
              }


              sc.close();
       }
}
