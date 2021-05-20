import java.util.Scanner;

// codeforces.com/problemset/problem/1037/C

public class Equalize {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String a = s.next();
        String b = s.next();
        int i = 0, d = 0;
        while(i < n) {
            if(a.charAt(i) != b.charAt(i)) {
                if(i < n - 1 && a.charAt(i + 1) == b.charAt(i) && a.charAt(i) == b.charAt(i + 1)) {
                    d++;
                    i++;
                }
                else {
                    d++;
                }
            }
            i++;
        }
        System.out.println(d);
    }
}
