import java.util.Scanner;

// codeforces.com/problemset/problem/1407/B

public class BigVova {

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, Math.abs(a - b));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int max_index = 0;
            for(int i = 0; i < n; i++) {
                a[i] = s.nextInt();
                max_index = a[max_index] > a[i] ? max_index : i;
            }
            b[0] = a[max_index];
            int last = a[max_index];
            a[max_index] = 0;
            for(int i = 1; i < n; i++) {
                int max_gcd = 0, index = 0;
                for(int j = 0; j < n; j++) {
                    if(gcd(last, a[j]) > max_gcd && a[j] != 0) {
                        max_gcd = gcd(last, a[j]);
                        index = j;
                    }
                }
                b[i] = a[index];
                last = max_gcd;
                a[index] = 0;
            }
            for(int i : b) System.out.print(i + " ");
            System.out.println();
        }
    }
}
