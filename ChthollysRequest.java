import java.util.Scanner;

// codeforces.com/problemset/problem/897/B

public class ChthollysRequest {

    public static String reverse(String s) {
        String res = "";
        for(int i = s.length() - 1; i >= 0; i--)
            res += s.charAt(i) + "";
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int p = s.nextInt();
        long res = 0;
        for(int i = 1; i <= k; i++) {
            String s1 = i + "";
            String s2 = reverse(s1);
            long n = Long.parseLong(s1 + s2);
            res += n % p;
            res %= p;
        }
        System.out.println(res);
    }
}