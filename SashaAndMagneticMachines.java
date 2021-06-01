import java.util.Scanner;

// codeforces.com/problemset/problem/1113/B

public class SashaAndMagneticMachines {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int sum = 0, min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            sum += a[i];
            if(min > a[i]) min = a[i];
        }
        int res = sum;
        for(int i = 0; i < n; i++) {
            for(int j = 2; j < a[i]; j++) {
                if(a[i] % j == 0) {
                    int d = sum - min - a[i];
                    d += min * j + a[i] / j;
                    res = Math.min(res, d);
                }
            }
        }
        System.out.println(res);
    }
}
