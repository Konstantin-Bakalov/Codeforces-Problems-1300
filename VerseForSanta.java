import java.util.Scanner;

// codeforces.com/contest/1279/problem/B

public class VerseForSanta {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int sec = s.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) a[i] = s.nextInt();
            int index = 0;
            for(int i = 0; i < n; i++) {
                if(a[i] > a[index]) index = i;
                sec -= a[i];
                if(sec < 0) break;
            }
            if(sec >= 0) index = -1;
            System.out.println(index + 1);
        }
    }
}
