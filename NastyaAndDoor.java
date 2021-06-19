import java.util.Scanner;

// codeforces.com/problemset/problem/1341/B

public class NastyaAndDoor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] pref = new int[n - k + 1];
            for(int i = 0; i < n; i++) a[i] = s.nextInt();
            for(int i = 1; i < a.length - 1;i ++) {
                if(a[i] > a[i - 1] && a[i] > a[i + 1]) b[i] = 1;
            }
            int sum = 0, l = 0, max_peak = 0;
            for(int i = 1; i < k - 1; i++) sum += b[i];
            pref[0] = sum;
            for(int i = 1; i < pref.length; i++) {
                pref[i] = pref[i - 1] - b[i] + b[k - 2 + i];
            }
            for(int i = 0; i < pref.length; i++) {
                if(pref[i] > max_peak) {
                    max_peak = pref[i];
                    l = i;
                }
            }
            System.out.println((max_peak + 1) + " " + (l + 1));
        }
    }
}