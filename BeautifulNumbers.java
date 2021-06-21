import java.io.PrintWriter;
import java.util.Scanner;

// codeforces.com/problemset/problem/1265/B

public class BeautifulNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        PrintWriter writer = new PrintWriter(System.out);
        while (t-- > 0) {
            int n = s.nextInt();
            int[] a = new int[2 * 100000 + 1];
            for (int i = 1; i <= n; i++) a[s.nextInt()] = i;
            int l = n, r = 1;
            String res = "";
            for(int i = 1; i <= n; i++) {
                l = Math.min(l, a[i]);
                r = Math.max(r, a[i]);
                if(r - l + 1 == i) writer.print("1");
                else writer.print("0");
            }
            writer.println();
        }
        writer.close();
    }
}