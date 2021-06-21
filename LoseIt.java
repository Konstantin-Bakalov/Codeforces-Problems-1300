import java.util.Scanner;

// codeforces.com/problemset/problem/1176/C

public class LoseIt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[6];
        int[] c = {4, 8, 15, 16, 23, 42};
        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            for(int j = 0; j < 6; j++)
                if(a[i] == c[j]) a[i] = j;
        }
        for(int i = 0; i < n; i++) {
            if(a[i] == 0) b[0]++;
            else if(b[a[i] - 1] > 0) {
                b[a[i] - 1]--;
                b[a[i]]++;
            }
        }
        System.out.println(n - 6 * b[5]);
    }
}