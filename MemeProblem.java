import java.util.Scanner;

// codeforces.com/problemset/problem/1076/C

public class MemeProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            double d = s.nextDouble();
            double D = d * d - 4 * d;
            double b1 = (d + Math.sqrt(D)) / 2;
            double b2 = (d - Math.sqrt(D)) / 2;
            double a1 = b1 / (b1 - 1);
            double a2 = b2 / (b2 - 1);
            if(a1 >= 0 && b1 >= 0) System.out.println("Y " + b1 + " " + a1);
            else if(a2 >= 0 && b2 >= 0) System.out.println("Y " + b2 + " " + a2);
            else System.out.println("N");
        }
    }
}
