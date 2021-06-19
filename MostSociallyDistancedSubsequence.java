import java.util.ArrayList;
import java.util.Scanner;

// codeforces.com/problemset/problem/1364/B

public class MostSociallyDistancedSubsequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) a[i] = s.nextInt();
            ArrayList<Integer> v = new ArrayList<>();
            v.add(a[0]);
            for(int i = 1; i < n - 1; i++) {
                if(a[i] < a[i - 1] && a[i] > a[i + 1]) continue;
                if(a[i] > a[i - 1] && a[i] < a[i + 1]) continue;
                else v.add(a[i]);
            }
            v.add(a[n - 1]);
            System.out.println(v.size());
            for(int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");
            System.out.println();
        }
    }
}
