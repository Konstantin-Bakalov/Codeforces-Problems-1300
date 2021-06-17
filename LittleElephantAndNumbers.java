import java.util.Scanner;

// codeforces.com/problemset/problem/221/B

public class LittleElephantAndNumbers {

    public static boolean commonDigit(int d, int x) {
        int[] a = new int[10];
        int[] b = new int[10];
        while(x > 0) {
            a[x % 10]++;
            x /= 10;
        }
        while(d > 0) {
            b[d % 10]++;
            d /= 10;
        }
        for(int i = 0; i < 10; i++)
            if(a[i] > 0 && b[i] > 0) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int res = 0;
        for(int i = 1; i * i <= x; i++) {
            if(x % i == 0) {
                res = commonDigit(i , x) ? res + 1 : res;
                res = commonDigit(x / i, x) && (i != x / i) ? res + 1 : res;
            }
        }
        System.out.println(res);
    }
}
