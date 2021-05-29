import java.util.Scanner;

// codeforces.com/problemset/problem/1360/D

public class BuyingShovels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            int max = 0;
            for(int i = 1; i * i <= n; i++) {
                if(n % i == 0) {
                    if(i <= k) max = Math.max(i, max);
                    if(n / i <= k) max = Math.max(n / i, max);
                }
            }
            System.out.println(n / max);
        }
    }
}
