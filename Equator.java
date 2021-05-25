import java.util.Scanner;

// codeforces.com/problemset/problem/962/A

public class Equator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int index = 0, totalSum = 0, sum = 0;
        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            totalSum += a[i];
        }
        for(int i = 0; i < n; i++) {
            sum += a[i];
            if(sum >= (int)Math.ceil((double)totalSum / 2)) {
                index = i;
                break;
            }
        }
        System.out.println(index + 1);
    }
}
