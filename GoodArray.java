import java.util.ArrayList;
import java.util.Scanner;

// codeforces.com/problemset/problem/1077/C

public class GoodArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int[] count = new int[(int)1e6 + 1];
        long sum = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            sum += a[i];
            count[a[i]]++;
        }
        for(int i = 0; i < n; i++) {
            sum -= a[i];
            if(sum >= 0 && sum % 2 == 0 && sum / 2 <= 1000000) {
               count[a[i]]--;
               if(count[(int)(sum / 2)] > 0) res.add(i + 1);
               count[a[i]]++;
            }
            sum += a[i];
        }
        System.out.println(res.size());
        for(int i : res) System.out.print(i + " ");
    }
}
