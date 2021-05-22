import java.util.Scanner;

// codeforces.com/problemset/problem/573/A

public class BearAndPoker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        for(int i = 0; i < n; i++) {
            while(a[i] % 2 == 0) a[i] /= 2;
            while(a[i] % 3 == 0) a[i] /= 3;
        }
        for(int i = 0; i < n - 1; i++)
            if(a[i] != a[i + 1]) {
                System.out.println("No");
                return;
            }
        System.out.println("Yes");
    }
}
