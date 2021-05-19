import java.util.Scanner;

// codeforces.com/problemset/problem/450/B

public class JzzhuAndSequences {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int n = s.nextInt();
        int mod = (int)Math.pow(10, 9) + 7;
        int[] f = new int[6];
        f[1] = x;
        f[2] = y;
        f[3] = y - x;
        f[4] = -x;
        f[5] = -y;
        f[0] = x - y;
        System.out.println((f[n % 6] % mod + mod) % mod);
    }
}
