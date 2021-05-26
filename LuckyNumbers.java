import java.util.Scanner;

// codeforces.com/contest/96/problem/B

public class LuckyNumbers {

    static long res = 0;

    public static void search(long a, int x, int y, long n) {
        if(a >= n && x == y && (a < res || res == 0)) {
            res = a;
            return;
        }
        if(a < 10000 * n) {
            search(10 * a + 4, x + 1, y, n);
            search(10 * a + 7, x, y + 1, n);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        search(0, 0, 0, n);
        System.out.println(res);
    }
}
