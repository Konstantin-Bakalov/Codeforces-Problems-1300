import java.util.Scanner;

// codeforces.com/problemset/problem/1249/C1

public class GoodNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        while(q-- > 0) {
            int n = s.nextInt();
            while(true) {
                int copy = n;
                boolean b = true;
                while(copy > 0) {
                    if(copy % 3 == 2) b = false;
                    copy /= 3;
                }
                if(b) break;
                n++;
            }
            System.out.println(n);
        }
    }
}
