import java.util.*;
public class MergeIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        System.out.println("Enter the no. of intervals: ");
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        
        //enter the starting and ending value of intervals
        System.out.println("Enter the intervals:");
        for(int i=0; i<n; i++) {
            intervals[i][0] = sc.nextInt(); // start
            intervals[i][1] = sc.nextInt(); // end 
        }

        int[][] merged = merge(intervals);
        System.out.println("Merged Intervals are: ");
        for(int[] i : merged) {
            System.out.println(i[0] + " " + i[1]);
        }
        sc.close();
    }
    public static int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        Stack<int[]> st = new Stack<>();
        st.push(intervals[0]);

        for(int i=1; i<intervals.length; i++) {
            int[] top = st.peek();
            int[] current = intervals[i];
            if(top[1] >= current[0]) {
                // Overlap: merge current with top
                top[1] = Math.max(top[1], current[1]);
            }
            else {
                // No overlap: push current
                st.push(current);
            }
        }
        //convert stack to array
        int[][] result = new int[st.size()][2];
        for(int i = st.size()-1; i>=0; i--) {
            result[i] = st.pop();
        }
        return result;
    }
}


// Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
// This is an important line — we are sorting the intervals by their start times.

// What’s happening:
// Arrays.sort(...) → A method to sort arrays in Java.

// intervals → The array we want to sort.

// (a, b) -> a[0] - b[0] → This is a lambda expression (just a short way to write a comparator).

// a and b are two intervals (like [1,3] and [2,6]).

// a[0] is the start of interval a.

// So: a[0] - b[0] means:

// if result is negative → a comes before b

// if result is zero → no change

// if result is positive → a comes after b

// | Array Type  | Can Use Lambda Comparator? |
// | ----------- | -------------------------- |
// | `int[]`     | ❌ No (primitive)           |
// | `Integer[]` | ✅ Yes                      |
// | `int[][]`   | ✅ Yes                      |

// Integer[] nums = {5, 1, 9, 2};
// Arrays.sort(nums, (a, b) -> a - b);  // ✅ Works now

