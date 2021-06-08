import java.util.Scanner;

// codeforces.com/problemset/problem/558/B

public class AmrAndTheLargeArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int l = 0, r = 0;
        int[] a = new int[n + 1];
        int[] b = new int[(int)10e6 + 1];
        int[] first = new int[(int)10e6 + 1];
        int[] last = new int[(int)10e6 + 1];
        for(int i = 1; i <= n; i++) {
            a[i] = s.nextInt();
            b[a[i]]++;
            if(first[a[i]] == 0) first[a[i]] = i;
            last[a[i]] = i;
        }
        int max = 0, min_diff = Integer.MAX_VALUE;
        for(int i = 1; i < b.length; i++) {
            if(b[i] > 0 && b[i] > max) {
                max = b[i];
                l = first[i];
                r = last[i];
                min_diff = last[i] - first[i] + 1;
            }
            else if(b[i] > 0 && b[i] == max && (last[i] - first[i] + 1) < min_diff) {
                min_diff = last[i] - first[i] + 1;
                l = first[i];
                r = last[i];
            }
        }
        System.out.println(l + " " + r);
    }
}
