import java.util.Scanner;

// codeforces.com/problemset/problem/1003/B

public class BinaryStringConstructing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int x = s.nextInt();
        if(x % 2 == 0 && a > b) {
            for(int i = 0; i < x / 2; i++) System.out.print("01");
            for(int i = 0; i < b - (x / 2); i++) System.out.print("1");
            for(int i = 0; i < a - (x / 2); i++) System.out.print("0");
        }
        else if(x % 2 == 0 && a <= b) {
            for(int i = 0; i < x / 2; i++) System.out.print("10");
            for(int i = 0; i < a - (x / 2); i++) System.out.print("0");
            for(int i = 0; i < b - (x / 2); i++) System.out.print("1");
        }
        else if(x % 2 == 1 && a > b) {
            for(int i = 0; i < x / 2; i++) System.out.print("01");
            for(int i = 0; i < a - (x / 2); i++) System.out.print("0");
            for(int i = 0; i < b - (x / 2); i++) System.out.print("1");
        }
        else if(x % 2 == 1 && a <= b) {
            for(int i = 0; i < x / 2; i++) System.out.print("10");
            for(int i = 0; i < b - (x / 2); i++) System.out.print("1");
            for(int i = 0; i < a - (x / 2); i++) System.out.print("0");
        }
    }
}
