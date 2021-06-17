import java.util.Scanner;

// codeforces.com/problemset/problem/146/B

public class LuckyMask {

    public static int mask(int x) {
        int res = 0, pow = 0;
        while(x > 0) {
            int digit = x % 10;
            if(digit == 4 || digit == 7) {
                res += digit * (int)Math.pow(10, pow);
                pow++;
            }
            x /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        a++;
        while(mask(a) != b) a++;
        System.out.println(a);
    }
}