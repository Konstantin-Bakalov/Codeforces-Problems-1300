import java.util.Scanner;

// codeforces.com/problemset/problem/922/A

public class CloningToys {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        if(y == 1 && x == 0) System.out.println("Yes");
        else if(x < y - 1) System.out.println("No");
        else {
            int copy = y - 1;
            if(copy >= 1 && (copy % 2 == x % 2)) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
