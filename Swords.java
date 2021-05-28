import java.util.Scanner;

// codeforces.com/problemset/problem/1216/D

public class Swords {

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        long x = 0, y = 0, z = 0;

        for(int i = 0; i < n; i++)
            if(a[i] > x) x = a[i];

        z = x - a[0];
        for(int i = 1; i < n; i++)
            z = gcd((int)z, (int)x - a[i]);

        for(int i = 0; i < n; i++)
            y += (x - a[i]) / z;

        System.out.println(y + " " + z);
    }
}
