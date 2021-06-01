import java.util.Scanner;

// codeforces.com/problemset/problem/1030/C

public class VasyaAndGoldenTicket {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();
        int sum = 0;
        for(int i = 0; i < str.length() - 1; i++) {
            sum += str.charAt(i) - '0';
            int sum1 = 0;
            int j = i + 1;
            boolean b = true;
            while(j < str.length()) {
                sum1 = str.charAt(j++) - '0';
                while(j < str.length() && sum1 + str.charAt(j) - '0' <= sum) {
                    sum1 += str.charAt(j++) - '0';
                }
                if(sum != sum1) {
                    b = false;
                    break;
                }
            }
            if(b) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
