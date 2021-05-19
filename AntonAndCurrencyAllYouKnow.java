import java.util.Scanner;

// codeforces.com/problemset/problem/508/B?mobile=false

public class AntonAndCurrencyAllYouKnow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char[] a = str.toCharArray();
        int index = -1;
        int last = a[a.length - 1] - '0';
        for(int i = 0; i < a.length - 1; i++) {
            int digit = a[i] - '0';
            if(digit % 2 == 0) index = i;
            if(digit % 2 == 0 && digit < last) break;
        }
        if(index == -1) System.out.println(-1);
        else {
            char temp = a[index];
            a[index] = a[a.length - 1];
            a[a.length - 1] = temp;
            for(char c : a) System.out.print(c);
        }
    }
}