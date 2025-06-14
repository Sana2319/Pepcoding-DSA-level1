import java.util.*;
public class Array {
    public static void main(String[] args) {
        // int[] arr;
        // arr =  new int[5];
        // arr[0] = 51;
        // arr[1] = 47;
        // arr[2] = 31;
        // arr[3] = 82;
        // arr[4] = 91;
        // System.out.println(arr.length);

        // int[] one = new int[5];
        // one[0] = 51;
        // one[1] = 47;
        // one[2] = 31;
        // one[3] = 82;
        // one[4] = 91;

        // int[] two = one;
        // two[2] = 310;

        // // for(int i=0; i<one.length; i++) {
        // //     System.out.println(one[i]);
        // // } or
        // for(int i=0; i<two.length; i++) {
        //     System.out.println(two[i]);
        // }
        // //in both 51 47 310 82 91 will be printed bcz in heap memory is allocated by new keyword so just a shallow copy is done from stack


    // // Span of an array(diff b/w max and min) (93)
    //     // Span of an array (93)
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the no of elements present in array: ");
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];
    //     for(int i=0; i<arr.length; i++) {
    //         System.out.println("Enter elements of array: ");
    //         arr[i] = sc.nextInt();
    //     }
    //     int max = arr[0];
    //     int min = arr[0];

    //     for(int i=0; i<arr.length; i++) {
    //         if(arr[i] > max) {
    //                 max = arr[i];
    //         }
    //         if(arr[i] < min) {
    //                 min = arr[i];
    //         }
    //     }
    //     int span = max - min;
    //     System.out.println("span is: "+ span);


        // // Find elements in an array (95)
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the no of elements present in array: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i=0; i<arr.length; i++) {
        //     System.out.println("Enter elements of array: ");
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("Enter the element to be searched: " );
        // int d = sc.nextInt();
        // for(int i=0; i<arr.length; i++) {
        //     if(arr[i] == d) {
        //         System.out.println("Element found at index: "+ i);
        //         sc.close();  // Close the scanner before returning(else it will give warning)
        //         return;
        //     }
        // }
        // System.out.println("Element not found");

        // // Bar chart (97)
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the no of elements present in array: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i=0; i<arr.length; i++) {
        //     System.out.println("Enter elements of array: ");
        //     arr[i] = sc.nextInt();
        // }
        // int max = arr[0];
        // for(int i=0; i<arr.length; i++) {
        //     if(arr[i] > max) {
        //         max = arr[i];
        //     }
        // }
        // for(int floor=max; floor>=1; floor--) {
        //     for(int i=0; i<arr.length; i++) {
        //         if(arr[i] >= floor) {
        //             System.out.print("*\t");
        //         }
        //         else {
        //             System.out.print("\t");
        //         }
        //     }
        //     System.out.println();
        // }

        // // Sum of two arrays (99)
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter n1: ");
        // int n1 = sc.nextInt();       
        // System.out.print("Enter n2: ");
        // int n2 = sc.nextInt();     
        // int[] arr1 = new int[n1];
        // int[] arr2 = new int[n2]; 
        // System.out.println("Enter elements of arr1:");
        // for(int i = 0; i < n1; i++) {
        //     arr1[i] = sc.nextInt();
        // } 
        // System.out.println("Enter elements of arr2:");
        // for(int i = 0; i < n2; i++) {
        //     arr2[i] = sc.nextInt();
        // }
        // // Ensuring both arrays have the same length for element-wise sum
        // int minLength = Math.min(n1, n2);
        // int[] sumArray = new int[minLength];        
        // System.out.println("Sum of corresponding elements:");
        // for(int i = 0; i < minLength; i++) {
        //     sumArray[i] = arr1[i] + arr2[i];
        //     System.out.println(sumArray[i]);
        // }
        
        // Or the other way
//         Scanner sc = new Scanner (System .in);
//         System.out.println("Enter n1: ");
//         int n1 = sc.nextInt();
//         int[] arr1 = new int[n1];
//         System.out.println("Enter elements of arr1: ");
//         for(int i=0; i<arr1.length; i++) {
//             arr1[i] = sc.nextInt();
//         }
//         System.out.println("Enter n2: ");
//         int n2 = sc.nextInt();
//         int[] arr2 = new int[n2];
//         System.out.println("Enter elements of arr2: ");
//         for(int i=0; i<arr2.length; i++) {
//             arr2[i] = sc.nextInt();
//         }
//         int[] sum = new int[n1 > n2? n1: n2];    //or int[] sum = new int[Math.max(n1, n2)];
//         int carry = 0;
//         int i = arr1.length - 1;
//         int j = arr2.length - 1;
//         int k = sum.length - 1;
//         while(k >= 0) {
//             int digit = carry;
//             if(i >= 0) {
//                 digit += arr1[i];
//             }
//             if(j >= 0) {
//                 digit += arr2[j];
//             }
//             carry = digit / 10;
//             digit = digit % 10;
//             sum[k] = digit;
//             i--;
//             j--;
//             k--;
//         }
// //This part is printing the final result of the sum digit-by-digit.
// //carry != 0: If there's a carry left after the last digit has been added (like in our dry run: carry = 1), we print that carry first, because it becomes the most significant digit.
// //for (int val : sum): This prints each digit of the sum array from left to right.
//         System.out.print("The sum is: ");
//         if (carry != 0) {
//             System.out.print(carry + " ");
//         }
//         for (int val : sum) {
//             System.out.print(val + " ");
//         }
//         sc.close();

// Diff b/w of two arrays(a2-a1) (101)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();       
        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();     
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2]; 
        System.out.println("Enter elements of arr1:");
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        } 
        System.out.println("Enter elements of arr2:");
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] diff = new int[n2];
        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;
        while(k >= 0) {
            int dig = 0;
            int arr2_val = arr2[j] + carry;
            int arr1_val = i >= 0? arr1[i]: 0; // e.g. 1000-1 arr1 here will be 0001
            if(arr2_val >= arr1_val) {
                dig = arr2_val - arr1_val;
                carry = 0;
            }
            else {
                dig = arr2_val + 10 - arr1_val;
                carry = -1;
            }
            diff[k] = dig;
            i--;
            j--; 
            k--;
        }
        // below whats's done 1000-999 = 0001 but i have to print just 1 not the preceding zeros
        int idx = 0;
        while (idx < diff.length && diff[idx] == 0) {
            idx++;
        }
        System.out.print("diff is: ");
        if (idx == diff.length) {
            // all digits were zero
            System.out.print("0");
        } 
        else {
            while (idx < diff.length) {
                System.out.print(diff[idx]);
                idx++;
            }
        }

        System.out.println();
        sc.close();
        
    }
}
