import java.util.Scanner;

// codeforces.com/contest/996/problem/B

public class WorldCup {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int min = Integer.MAX_VALUE;
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            min = a[i] < min ? a[i] : min;
        }
        int times = min / n;
        for(int i = 0; i < n; i++) a[i] = a[i] - (times * n);
        int index = 0, d = 0;
        while(true) {
            if(index == n) index = 0;
            if(a[index] - d <= 0) {
                System.out.println(index + 1);
                break;
            }
            d++;
            index++;
        }
    }
}
