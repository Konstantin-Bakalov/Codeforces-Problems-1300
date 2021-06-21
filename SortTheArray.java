import java.util.Arrays;
import java.util.Scanner;

// codeforces.com/problemset/problem/451/B

public class SortTheArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int index1 = 0, index2 = n - 1;
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            b[i] = a[i];
        }
        Arrays.sort(b);
        while(index1 < n && a[index1] == b[index1]) index1++;
        while(index2 >= 0 && a[index2] == b[index2]) index2--;
        if(index1 == n && index2 == -1) {
            System.out.println("yes");
            System.out.println("1 1");
        }
        else if(a[index2] == b[index1] && a[index1] == b[index2]){
            boolean bo = true;
            for(int i = index1; i <= index2; i++) {
                if(a[i] != b[index1 + index2 - i]) {
                    bo = false;
                    break;
                }
            }
            if(bo) {
                System.out.println("yes");
                System.out.print((index1) + 1 + " " + (index2 + 1));
            }
            else System.out.println("no");
        }
        else System.out.println("no");
    }
}
