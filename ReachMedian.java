import java.util.Arrays;
import java.util.Scanner;

// codeforces.com/problemset/problem/1037/B

public class ReachMedian {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int mid = s.nextInt();
        long res = 0;
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        Arrays.sort(a);
        if(mid >= a[n / 2]) {
            int diff = mid - a[n / 2];
            a[n / 2] = mid;
            res += diff;
            Arrays.sort(a);
            int index = n / 2;
            while(index < n && a[index] < mid) {
                res += mid - a[index];
                a[index] = mid;
                index++;
            }
        }
        else {
            int diff = a[n / 2] - mid;
            a[n / 2] = mid;
            res += diff;
            Arrays.sort(a);
            int index = n / 2;
            while(index > 0 && a[index] > mid) {
                res += a[index] - mid;
                a[index] = mid;
                index--;
            }
        }
        System.out.println(res);
    }
}
